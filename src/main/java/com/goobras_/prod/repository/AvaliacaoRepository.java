package com.goobras_.prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobras_.prod.entity.avaliacao;

public interface AvaliacaoRepository extends JpaRepository<avaliacao, Long> {
    // adicione métodos personalizados aqui, se necessário
}
