package br.com.WebAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NatanApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatanApplication.class, args);
		System.out.println("Logado!");
	}

}


	//http://localhost:8080/h2-console
	//org.h2.Driver
	//jdbc:h2:mem:testdb
	//sa