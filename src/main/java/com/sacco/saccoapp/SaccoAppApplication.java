package com.sacco.saccoapp;

import com.sacco.saccoapp.loan.Loan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SaccoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaccoAppApplication.class, args);
	}



}
