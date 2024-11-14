package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class OpenApiConfig {
	
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
					.title("REST FULL API with Java 18 and Spring boot 3")
					.version("v1")
					.description("API CADASTRO")
					.termsOfService("www.google.com")
					.license(
						new License()
							.name("Apache 2.0")
							.url("www.google.com")
							)
					);
	}

}
