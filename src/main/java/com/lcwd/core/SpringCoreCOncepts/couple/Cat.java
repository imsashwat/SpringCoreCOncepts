package com.lcwd.core.SpringCoreCOncepts.couple;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {

    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("play karo cat");

    }

}
