package com.goobras_.prod;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.goobras_.prod.repository.ClientRepository;

@SpringBootTest
public class TesteConexao{

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void testDatabaseConnection() {
        long count = clientRepository.count();
        System.out.println("Number of records in Client table: " + count);
    }

}
