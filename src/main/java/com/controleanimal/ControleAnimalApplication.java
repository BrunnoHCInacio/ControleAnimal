package com.controleanimal;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ControleAnimalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleAnimalApplication.class, args);
	}
	
	/*@Bean
	public FixedLocaleResolver localeResolver() {
	return new FixedLocaleResolver(new Locale("pt", "BR"));
	}*/
}
