package com.goobras_.prod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.goobras_.prod.entity.Client;
import com.goobras_.prod.services.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public List<Client> getAllClients() {
        return clientService.getAllClient();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long id) {
        Client client = clientService.getClientById(id);
        return ResponseEntity.ok().body(client);
    }

    @PostMapping("")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createdClient = clientService.saveClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdClient);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> deleteClient(@PathVariable(value = "id") Long id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok().build();
    }
}
