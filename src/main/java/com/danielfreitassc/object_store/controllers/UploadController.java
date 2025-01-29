package com.danielfreitassc.object_store.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.danielfreitassc.object_store.services.UploadService;

@RestController
@RequestMapping("/images")
public class UploadController {
    private final UploadService uploadService;

    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping
    public void upload(@RequestParam("multipartFile") MultipartFile multipartFile) throws Exception {
        uploadService.upload(multipartFile);
    }   
    
    @GetMapping(value = "/{objectId}", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage(@PathVariable String objectId) throws Exception {
        return uploadService.getImage(objectId);
    }
}
