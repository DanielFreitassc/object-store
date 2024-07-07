package com.daniel.gestao_vagas.modules.candidate.services;

import org.springframework.stereotype.Service;

import com.daniel.gestao_vagas.modules.candidate.models.CandidateEntity;

@Service
public class CandidateService {
    

    public void create(CandidateEntity candidateEntity) {
        System.out.println(candidateEntity);
    }
}
