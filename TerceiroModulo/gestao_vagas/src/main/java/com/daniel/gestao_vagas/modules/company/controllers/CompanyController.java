package com.daniel.gestao_vagas.modules.company.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.gestao_vagas.modules.company.models.CompanyEntity;
import com.daniel.gestao_vagas.modules.company.services.CompanyService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;


    @PostMapping
    public ResponseEntity<Object> create(@RequestBody @Valid CompanyEntity companyEntity) {
        try {
            var result = companyService.create(companyEntity);
            return ResponseEntity.ok().body(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
