package com.mikailexample.demo.repo;

import org.springframework.stereotype.*;
import com.mikailexample.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    public void save(Student s) {
        String sql = "insert into student (id, name, grade) values (?, ?, ?)";
        int var = jdbc.update(sql, s.getID(), s.getName(), s.getGrade());
        System.out.println(var + " affected");
    }

    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        return students;
    }
}
