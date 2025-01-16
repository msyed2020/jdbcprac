package com.mikailexample.demo.repo;

import org.springframework.stereotype.*;
import com.mikailexample.demo.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.*;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String sql = "select * from student";
        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setID(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setGrade(rs.getInt("grade"));
                return s;
            }
        };
        return jdbc.query(sql, mapper);
    }
}
