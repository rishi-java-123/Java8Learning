package java8.funtional.interfaces.playfultest;

import java.util.ArrayList;
import java.util.List;

//The Playful Pets pet store wants a program to search for pets currently in the store.
//The information stored for each pet is name,animal,breed,color,and price.When performing a search,the program should list the first pet that matches the criterion and then list all the pets that match the criterion.
//The most common search criteria are search by breed and search by price.Use the program to search for 
//poodles and to search for pets for $800 or less.

public class Pets {

	String name;
	String animal;
	String breed;
	String color;
	double price;

	static List<Pets> petList = new ArrayList<Pets>();

	public Pets(String name, String animal, String breed, String color, double price) {
		super();
		this.name = name;
		this.animal = animal;
		this.breed = breed;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pets [name=" + name + ", animal=" + animal + ", breed=" + breed + ", color=" + color + ", price="
				+ price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Pets p = (Pets) obj;
		return animal.equals(p.animal) && breed.equals(p.breed);
	}

}
