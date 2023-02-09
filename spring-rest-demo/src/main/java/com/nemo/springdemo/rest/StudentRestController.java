package com.nemo.springdemo.rest;

import com.nemo.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        Student s1 = new Student("Nemo", "G");
        Student s2 = new Student("Nil", "G");
        Student s3 = new Student("Minif", "F");
        Student s4 = new Student("Hana", "Gol");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        return students;
    }
}
