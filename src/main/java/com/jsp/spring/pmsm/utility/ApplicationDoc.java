package com.jsp.spring.pmsm.utility;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
//sterotype
@OpenAPIDefinition
public class ApplicationDoc {
	
	Contact contact() {
		return new Contact().name("abhi")
				.url("abc.in")
				.email("abhi@gmail.com");
	}
	
	
	
	//documentation
	@Bean
	Info info() {
		return new Info().title("product management system")
				.description("RESTFUL API with basic CRUD Operation")
				.version("v1");
	}
@Bean

OpenAPI openAPI() {
	return new OpenAPI().info(info());
}
}
