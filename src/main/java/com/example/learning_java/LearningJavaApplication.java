package com.example.learning_java;

import com.example.learning_java.annotation.Annotation1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningJavaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningJavaApplication.class, args);
        Annotation1 annotation1 = new Annotation1();
        System.out.println(annotation1);
    }
}
