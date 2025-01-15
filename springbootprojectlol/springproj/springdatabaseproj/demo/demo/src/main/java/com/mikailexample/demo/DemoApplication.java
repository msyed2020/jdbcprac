package com.mikailexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;
import com.mikailexample.demo.model.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setID(10);
		s.setName("Terra");
		s.setGrade(100);
	}

}
