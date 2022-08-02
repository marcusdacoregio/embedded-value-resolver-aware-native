package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyConfig.class)
public class EmbeddevalueresolverawareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddevalueresolverawareApplication.class, args);
	}

}
