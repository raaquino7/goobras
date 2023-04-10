package com.goobras_.prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobras_.prod.entity.prestador;

public interface PrestadorRepository extends JpaRepository<prestador, Long> {
    // adicione métodos personalizados aqui, se necessário
}
