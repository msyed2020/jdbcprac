package com.mikailexample.demo.model;

import org.springframework.stereotype.*;
import org.springframework.context.annotation.Scope;;

@Component
@Scope("prototype")
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
