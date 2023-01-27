package com.lcwd.core.SpringCoreCOncepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    Animal animal;

    // cunstructor based injection
    @Autowired // dependen
    public Person(Animal animal) {
        System.out.println("calling cinstructo");
        this.animal = animal;
    }

    public void playWithAnimal() {
        animal.play();
    }
}
