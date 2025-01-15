package com.mikailexample.demo.service;

import com.mikailexample.demo.model.*;
import org.springframework.stereotype.Service;
import com.mikailexample.demo.repo.*;

@Service
public class StudentService {

    private StudentRepo repo;

    public void addStudent(Student s) {
        System.out.println("Add student");
    }

    public StudentRepo getStudentRepo() {
        return repo;
    }

    public void setStudentRepo(StudentRepo repo) {
        this.repo = repo;
    }
}
