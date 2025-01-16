package com.mikailexample.demo.service;

import com.mikailexample.demo.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mikailexample.demo.repo.*;

@Service
public class StudentService {

    private StudentRepo repo;
    private List<Student> students;

    public void addStudent(Student s) {
        repo.save(s);
    }

    public StudentRepo getStudentRepo() {
        return repo;
    }
    @Autowired
    public void setStudentRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
