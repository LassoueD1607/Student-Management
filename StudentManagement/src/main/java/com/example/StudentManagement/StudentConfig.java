package com.example.StudentManagement;

import com.example.StudentManagement.entity.Student;
import com.example.StudentManagement.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
   @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student student1 = new Student(
                    "Motez",
                    "Lassoued",
                    "MotezLassoued@Gmail.com"
            );
            Student student2 = new Student(
                    "Ahmed",
                    "Lassoued",
                    "AhmedLassoued@Gmail.com"
            );

            studentRepository.saveAll(List.of(student1,student2))   ;
        };
    }
}
