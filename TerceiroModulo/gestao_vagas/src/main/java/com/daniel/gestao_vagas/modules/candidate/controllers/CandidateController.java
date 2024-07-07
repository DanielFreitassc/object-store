package com.daniel.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.gestao_vagas.modules.candidate.models.CandidateEntity;
import com.daniel.gestao_vagas.modules.candidate.services.CandidateService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/candidate")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;

    @PostMapping
    public void create(@RequestBody @Valid CandidateEntity candidateEntity) {
    }

    @GetMapping
    public void getAll() {

    }

    @GetMapping("{id}")
    public void findById() {

    }

    @PutMapping("{id}")
    public void updateById() {

    }

    @DeleteMapping("{id}")
    public void deleteById() {
        
    }
}
