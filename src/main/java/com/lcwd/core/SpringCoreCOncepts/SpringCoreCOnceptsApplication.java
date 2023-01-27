package com.lcwd.core.SpringCoreCOncepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lcwd.core.SpringCoreCOncepts.couple.Animal;
import com.lcwd.core.SpringCoreCOncepts.couple.Dog;
import com.lcwd.core.SpringCoreCOncepts.couple.Person;

@SpringBootApplication
public class SpringCoreCOnceptsApplication {

	public static void main(String[] args) {

		// ye line springboot ko start krti h
		SpringApplication.run(SpringCoreCOnceptsApplication.class, args);

		// loosely coupled
		Animal animal = new Dog(); // interface me daal skte h child class
		Person p = new Person(animal); // default constructor run
		p.PlayWithAnimal();

		// p.PlayWithAnimal();

	}

}
