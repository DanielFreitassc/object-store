package com.daniel.gestao_vagas.modules.company.services;

import org.springframework.stereotype.Service;

import com.daniel.gestao_vagas.modules.candidate.exceptions.UserFoundException;
import com.daniel.gestao_vagas.modules.company.models.CompanyEntity;
import com.daniel.gestao_vagas.modules.company.repositories.CompanyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyEntity create(CompanyEntity companyEntity) {
        companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail()).ifPresent((user) ->{
        throw new UserFoundException();
       });

       return companyRepository.save(companyEntity);
    }
}
