package br.com.erudio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI CustomOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("Rest API with Java and SpringBoot")
						.version("v1")
						.description("")
						.termsOfService("")
						.license(new License().name("Apache 2.0").url("")));
	}
}
