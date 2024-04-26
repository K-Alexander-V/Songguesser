package com.exxeta.omni_potentials.songguesserdata;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;



@Entity
public class Person {
	
	
	
	@Id
	private String name;

	protected Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name) {
		super();
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public String getName1() {
		return name;
	}

	
}
