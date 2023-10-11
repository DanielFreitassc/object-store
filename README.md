# Projetos em Java

## Aqui farei alguns projetos em java 
# Spring boot 
```
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.11&packaging=jar&jvmVersion=17&groupId=com.dan&artifactId=toDolist&name=toDolist&description=Gerenciador%20de%20arquivos&packageName=com.dan.toDolist&dependencies=web](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.11&packaging=jar&jvmVersion=17&groupId=com.dan&artifactId=toDolist&name=toDolist&description=Gerenciador%20de%20arquivos&packageName=com.dan.toDolist&dependencies=web)https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.11&packaging=jar&jvmVersion=17&groupId=com.dan&artifactId=toDolist&name=toDolist&description=Gerenciador%20de%20arquivos&packageName=com.dan.toDolist&dependencies=web
```
controller 
```
package com.dan.toDolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController{
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }

}
```
# [Apidog](https://apidog.com/download/)

### New Request
### Post
```
http://localhost:8080/users/
```
```
{
    "name": "xxx",
    "username": "xxx",
    "password": "xxx"
}
```
