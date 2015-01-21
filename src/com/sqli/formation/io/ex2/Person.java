package com.sqli.formation.io.ex2;

import java.util.Date;

public class Person {
	private final String firstName;
	private final String lastName;
	private final String creation;

	public Person(String firstName, String lastName, String creation) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.creation = creation;
	}
	
	@Override
	public String toString() {
		//return lastName+";"+firstName+";"+creation;
		return lastName+"\n"+firstName+"\n"+creation+"\n---------------------------------------------";
	}

}
