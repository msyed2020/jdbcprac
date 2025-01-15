package com.mikailexample.demo;

import org.springframework.stereotype.*;

@Component
public class Student {
    private int id;
    private String name;
    private int grade;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
