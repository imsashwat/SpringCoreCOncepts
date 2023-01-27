package com.lcwd.core.SpringCoreCOncepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lcwd.core.SpringCoreCOncepts.couple.Animal;
//import com.lcwd.core.SpringCoreCOncepts.couple.Dog;
import com.lcwd.core.SpringCoreCOncepts.couple.Person;

@SpringBootApplication
public class SpringCoreCOnceptsApplication {

	public static void main(String[] args) {

		// ye line springboot ko start krti h

		ApplicationContext context = SpringApplication.run(SpringCoreCOnceptsApplication.class, args);
		Person personBean = context.getBean(Person.class); // automatic constroctor called
		// personBean.playWithAnimal(); // -> play karo cat

		// personBean.PlayWithAnimal();

		// p.PlayWithAnimal();
	}

}
