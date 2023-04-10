package com.goobras_.prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobras_.prod.entity.servico;

public interface ServicoRepository extends JpaRepository<servico, Long> {
    // adicione métodos personalizados aqui, se necessário
}
