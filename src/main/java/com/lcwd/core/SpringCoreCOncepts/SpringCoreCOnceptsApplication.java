package com.lcwd.core.SpringCoreCOncepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lcwd.core.SpringCoreCOncepts.couple.Person;

@SpringBootApplication
public class SpringCoreCOnceptsApplication {

	public static void main(String[] args) {

		// ye line springboot ko start krti h
		SpringApplication.run(SpringCoreCOnceptsApplication.class, args);

		Person p = new Person();
		// p.PlayWithAnimal();

	}

}
