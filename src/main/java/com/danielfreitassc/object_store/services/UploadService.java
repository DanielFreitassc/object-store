package com.danielfreitassc.object_store.services;

import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.compress.utils.IOUtils;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import io.minio.GetObjectArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;

@Service
public class UploadService {
    private final MinioClient minioClient;
    private final JdbcClient jdbcClient;

    public UploadService(MinioClient minioClient, JdbcClient jdbcClient) {
        this.minioClient = minioClient;
        this.jdbcClient = jdbcClient;
    }

    public void upload(MultipartFile multipartFile) throws Exception {
        InputStream inputStream = multipartFile.getInputStream();
        String objectId = UUID.randomUUID().toString();
        long fileSize = multipartFile.getSize();

        minioClient.putObject(
            PutObjectArgs.builder()
            .bucket("images").object(objectId).stream(inputStream, fileSize, -1)
            .contentType(multipartFile.getContentType())
            .build()
        );

        jdbcClient.sql("""
                INSERT INTO images (object_id) VALUES (:objectId)
                """)
                .param("objectId", objectId)
                .update();
    }

    public byte[] getImage(String objectId) throws Exception {
        var stream = minioClient.getObject(
            GetObjectArgs.builder().bucket("images").object(objectId).build()
        );
        return IOUtils.toByteArray(stream);
    }
}
