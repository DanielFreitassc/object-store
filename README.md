# Object Store API

## Descrição
Esta é uma API simples para armazenamento e recuperação de imagens utilizando o MinIO como servidor de objetos e um banco de dados H2 para gerenciamento dos metadados das imagens. A API é desenvolvida com Spring Boot e expõe endpoints para upload e download de imagens.

## Tecnologias Utilizadas
- **Spring Boot**
- **Spring Web**
- **MinIO** (para armazenamento de objetos)
- **H2 Database** (para armazenamento de metadados)
- **Docker Compose** (para facilitar a execução do MinIO)

## Configuração do Ambiente
Antes de iniciar a API, certifique-se de que o MinIO está em execução. Caso contrário, inicie-o utilizando o Docker Compose.

### Subindo o MinIO com Docker Compose
```sh
services:
  minio:
    image: quay.io/minio/minio
    container_name: minio1
    ports:
      - "9000:9000"
      - "9001:9001"
    environment:
      MINIO_ROOT_USER: ROOTUSER
      MINIO_ROOT_PASSWORD: CHANGEME123
    volumes:
      - H:/data:/data
    command: server /data --console-address ":9001"
```
Para iniciar o MinIO, execute:
```sh
docker-compose up -d
```
O MinIO ficará acessível em `http://localhost:9000`, e o console de administração em `http://localhost:9001`.

## Endpoints da API

### Upload de Imagem
**Endpoint:** `POST /images`

**Parâmetros:**
- `multipartFile` (arquivo de imagem a ser enviado)

**Exemplo de Requisição (cURL):**
```sh
curl -X POST "http://localhost:8080/images" -H "Content-Type: multipart/form-data" -F "multipartFile=@caminho/para/imagem.png"
```

### Download de Imagem
**Endpoint:** `GET /images/{objectId}`

**Parâmetros:**
- `objectId` (ID do objeto armazenado no MinIO)

**Exemplo de Requisição:**
```sh
curl -X GET "http://localhost:8080/images/{objectId}" -o imagem_baixada.png
```

## Estrutura do Projeto
```
com.danielfreitassc.object_store
├── config (Configuração do MinIO)
├── controllers (Endpoints da API)
├── services (Lógica de negócio e comunicação com MinIO e H2)
├── application.yml (Configuração do Spring Boot)
```

## Considerações
- A API utiliza um banco de dados H2 em memória, o que significa que os metadados das imagens são apagados quando a aplicação é reiniciada.
- É recomendável configurar o MinIO com credenciais mais seguras em ambientes de produção.
- Para acessar o console do MinIO, utilize as credenciais `ROOTUSER / CHANGEME123`.

## Autor
Desenvolvido por Daniel Freitas (com.danielfreitassc).

