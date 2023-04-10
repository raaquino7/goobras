package com.goobras_.prod.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goobras_.prod.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findById(Long id);

    Client save(Client client);

    void deleteById(Long id);

    long count();
}
