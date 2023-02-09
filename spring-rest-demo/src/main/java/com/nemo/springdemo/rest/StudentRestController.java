package com.nemo.springdemo.rest;

import com.nemo.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        Student s1 = new Student("Nemo", "G");
        Student s2 = new Student("Nil", "G");
        Student s3 = new Student("Minif", "F");
        Student s4 = new Student("Hana", "Gol");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return students.get(studentId);
    }
}
