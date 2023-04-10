package com.goobras_.prod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@Repository
@EnableSpringDataWebSupport
public class ProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdApplication.class, args);
	}

}
