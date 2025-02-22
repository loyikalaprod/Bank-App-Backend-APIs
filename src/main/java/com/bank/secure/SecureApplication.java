package com.bank.secure;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Documentation - Backend APIs | Aplication Bancaire sécurisée en ligne \n",
				description = "L'application bancaire sécurisée est une solution de gestion des comptes bancaires permettant \n" +
						" aux utilisateurs de créer des comptes, d'effectuer des transactions (crédit, débit, virement) et \n" +
						" de consulter leur solde. " +
						"Elle est développée avec Spring Boot et utilise Hibernate pour l'interaction avec la base de données.  ",
				version = "v1.0",
				contact = @Contact(
					name = "Hossain NGARI",
						email = "hossainprogrammer@gmail.com",
						url = "https://github.com/loyikalaprod"
				)

		),
		externalDocs = @ExternalDocumentation(
				description= "Application Bancaire Documentation"
		)

)
public class SecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureApplication.class, args);
	}

}
