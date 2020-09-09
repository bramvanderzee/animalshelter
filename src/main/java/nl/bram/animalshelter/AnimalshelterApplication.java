package nl.bram.animalshelter;

import nl.bram.animalshelter.animals.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalshelterApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalshelterApplication.class, args);
		Dog dog = new Dog("Joeri", Gender.MALE);
		dog.walk();

		Cat cat = new Cat("Siora", Gender.FEMALE, "perfectionistic");
		cat.Reserve("Rob");

		System.out.println(dog.toString());
		System.out.println(cat.toString());
	}
}
