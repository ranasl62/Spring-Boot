package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Student student = new Student(130,"Md. Rana Hossain",3.98);
        Stream.Builder<Student> studentStream =Stream.builder();
        Student[] students={new Student(142,"Shihab",3.89),
                new Student(142,"Rian",3.8)};
        studentStream.accept(student);
        for (Student a :students ) {
            studentStream.accept(a);
        }
        double sum = studentStream.build().mapToDouble(Student::getStudentCgpa).sum();
        long count = studentStream.build().map(Student::getStudetnId).count();
        System.out.println(sum+" "+count);


    }
}
