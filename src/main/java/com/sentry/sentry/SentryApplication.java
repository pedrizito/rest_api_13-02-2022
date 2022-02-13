package com.sentry.sentry;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SentryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentryApplication.class, args);
	}


	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("").version("1.0").termsOfService("http://swagger.io/terms"));
	}

}
