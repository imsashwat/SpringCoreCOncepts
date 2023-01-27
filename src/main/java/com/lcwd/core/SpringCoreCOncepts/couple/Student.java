package com.lcwd.core.SpringCoreCOncepts.couple;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student() { // default constructor
        System.out.println("creating student");
    }

    public void detail() {
        System.out.println("i am student detail");
    }

}
