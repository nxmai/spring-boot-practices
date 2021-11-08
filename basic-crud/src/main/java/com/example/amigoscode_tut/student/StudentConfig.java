package com.example.amigoscode_tut.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mai = new Student(
                    "mai",
                    LocalDate.of(2000, Month.APRIL, 5),
                    "mai@gmail.com"
            );

            Student alex = new Student(
                    "alex",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(mai, alex)
            );
        };
    }
}
