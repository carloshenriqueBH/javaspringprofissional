package com.devsuperior.aula;

import com.devsuperior.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	private final SalaryService salaryService;
	
	public AulaApplication(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {

		SpringApplication.run(AulaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {


	}
}
