package com.goobras_.prod.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobras_.prod.entity.pedido;

public interface PedidoRepository extends JpaRepository<pedido, Long> {
    // adicione métodos personalizados aqui, se necessário
}
