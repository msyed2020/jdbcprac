package com.mikailexample.demo.service;

import com.mikailexample.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public void addStudent(Student s) {
        System.out.println("Add student");
    }
}
