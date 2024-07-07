package com.daniel.gestao_vagas.modules.company.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;
     @Pattern(regexp = "^\\S+", message = "Username não pode conter apenas espaços em branco")
    private String username;

    @Email( message = "Email precisa ser válido")
    private String email;
    @Length(min = 6, message = "Senha deve ter no minímo 6 carcteres")
    private String password;
    private String website;
    private String name;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
