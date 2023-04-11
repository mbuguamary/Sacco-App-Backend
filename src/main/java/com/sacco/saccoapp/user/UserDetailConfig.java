package com.sacco.saccoapp.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserDetailConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            UserDetailRepository repository
    ){
     return args -> {
         UserDetail mary =new UserDetail(
                 1l,
                 "mh234",
                 "m@gmail.com",
                 "test12"
         );
         UserDetail jane =new UserDetail(
                 2l,
                 "mh235",
                 "j@gmail.com",
                 "test12"
         );
         repository.saveAll(
                 List.of(mary,jane)
         );
     } ;
    }

}
