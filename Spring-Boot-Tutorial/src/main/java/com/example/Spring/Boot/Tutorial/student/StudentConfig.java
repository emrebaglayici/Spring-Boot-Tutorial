package com.example.Spring.Boot.Tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student emre=new Student(
                    "Emre","emrebaglayici1@gmail.com",
                    LocalDate.of(1996, Month.OCTOBER,16)
            );
            Student elif=new Student("Elif","elifsayili@gmail.com",
                    LocalDate.of(1999, Month.JANUARY,19)
            );
            repository.saveAll(
                    List.of(emre,elif)
            );
        };
    }
}
