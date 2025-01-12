package com.mikaildemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Laptop laptop;

    public void code() {
        System.out.println("Yes, I'm coding");
        laptop.compile();
    }
}