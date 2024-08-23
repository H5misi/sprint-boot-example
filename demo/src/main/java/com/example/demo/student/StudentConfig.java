package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hazem = new Student(
                    "Hazem",
                    "hazem@gmail.com",
                    LocalDate.of(2001, MAY, 5),
                    21
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY, 5),
                    21
            );

            repository.saveAll(
                    List.of(hazem, alex)
            );


        };
    }
}