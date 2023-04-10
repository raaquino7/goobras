package com.goobras_.prod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prestador")

public class prestador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "recomendação")
    private String recomendação;

    @Column(name = "outro")
    private String outro;

    // getters e setters
}
