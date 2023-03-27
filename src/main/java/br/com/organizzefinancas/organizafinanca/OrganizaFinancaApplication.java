package br.com.organizzefinancas.organizafinanca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class OrganizaFinancaApplication {


	@GetMapping 
	public String getHomeTeste() {
		return "organiza financas";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrganizaFinancaApplication.class, args);
	}

}
