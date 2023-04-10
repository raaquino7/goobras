package com.goobras_.prod.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.goobras_.prod.entity.Client;
import com.goobras_.prod.repository.ClientRepository;
import java.util.List;


@Service
public class ClientService {

    @Autowired
    private ClientRepository ClientRepository;

    public List<Client> getAllClient() {
        return ClientRepository.findAll();
    }

    public Client getClientById(Long id) {
        return ClientRepository.findById(id)
                .orElseThrow(() -> new com.goobras_.prod.ResourceNotFoundException("Cliente não encontrado com o id: " + id));
    }
    

    public Client saveClient(Client client) {
        return ClientRepository.save(client);
    }

    public void deleteClientById(Long id) {
        ClientRepository.deleteById(id);
    }
}
