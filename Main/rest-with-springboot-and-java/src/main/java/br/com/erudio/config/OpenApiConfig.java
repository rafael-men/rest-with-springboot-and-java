package br.com.erudio.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

	@Bean
	public GroupedOpenApi api() {
		return GroupedOpenApi.builder()
				.group("v0.0.1")
				.packagesToScan("br.com.erudio")
				.displayName("API REST com SpringBoot e MySQL")
				.build();
	}
}
