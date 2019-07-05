package com.soumen.microservices.studentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/stduent")
public class StudentController {

    @GetMapping("/list")
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(new Student[]{new Student("Soumen", "A/1"),
                new Student("Souvik", "A/2"),
                new Student("Amit", "A/3")});
        return students;
    }
}
