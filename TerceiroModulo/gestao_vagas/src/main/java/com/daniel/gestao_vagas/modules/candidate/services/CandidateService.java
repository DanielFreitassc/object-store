package com.daniel.gestao_vagas.modules.candidate.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.daniel.gestao_vagas.modules.candidate.exceptions.UserFoundException;
import com.daniel.gestao_vagas.modules.candidate.models.CandidateEntity;
import com.daniel.gestao_vagas.modules.candidate.repositories.CandidateRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CandidateService {
    private final CandidateRepository candidateRepository;

    public CandidateEntity create(CandidateEntity candidateEntity) {
        Optional<CandidateEntity> candidate = candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail());
        if (candidate.isPresent()) {
            throw new UserFoundException();
        }
        return candidateRepository.save(candidateEntity);
        
    }
}
