package com.g.aleprojetos.logistica.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Cliente {

    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank//impede que passei os dados null ou vazio
    @Size(max = 60)//máximo de 60 caracteres
    private String nome;

    @NotBlank//impede que passei os dados null ou vazio
    @Email
    @Size(max = 255)//máximo de 255 caracteres
    private String email;

    @NotBlank//impede que passei os dados null ou vazio
    @Size(max = 20)//máximo de 20 caracteres
    @Column(name = "fone")
    private String telefone;



}
