package com.sacco.saccoapp.loan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoanConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            LoanRepository repository

    ) {
        return args -> {
        Loan development=    new Loan(
                 1L,
                 "MARY" ,
                 "MHS345" ,
                 "development",
                 10000.00
            );
         Loan instant =   new Loan(
                    2L,
                    "ANNE" ,
                    "MHS346" ,
                    "INSTANT",
                    10000.00
            );
         repository.saveAll(
                 List.of(development,instant)
         );
        };
    }

}
