package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student sinan = new Student(
        "sinan",
        "sinan@email.com",
        LocalDate.of(2000, Month.JANUARY, 5),
        21
      );

      Student alex = new Student(
        "alex",
        "alex@email.com",
        LocalDate.of(2001, Month.JANUARY, 15),
        22
      );

      repository.saveAll(List.of(sinan, alex));
    };
  }

}
