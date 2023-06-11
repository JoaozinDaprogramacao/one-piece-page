package com.br.demo.project.onepiecepages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.br.demo.project.onepiecepages.repository")
public class OnePiecePagesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnePiecePagesApplication.class, args);
	}

}
