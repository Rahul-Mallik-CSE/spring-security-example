package com.rahul.SpringSecurityExample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Rahul", "90"),
                new Student(2, "Rohit", "80"),
                new Student(3, "Suresh", "85")
        );
    }
}
