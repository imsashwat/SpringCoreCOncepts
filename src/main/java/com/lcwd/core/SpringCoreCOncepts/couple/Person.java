package com.lcwd.core.SpringCoreCOncepts.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    Animal animal;
    Student student;

    // cunstructor based injection
    // @Autowired // dependen
    // public Person(Animal animal) {
    // System.out.println("calling cinstructo");
    // this.animal = animal;
    // }

    @Autowired // on setter
    public void setAnimal(Animal animal) {
        System.out.println("calling cinstructo setAnimal");
        this.animal = animal;
    }

    @Autowired // on setter
    public void setStudent(Student student) {
        System.out.println("calling cinstructo setStundent");
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void playWithAnimal() {

        animal.play();
    }
}
