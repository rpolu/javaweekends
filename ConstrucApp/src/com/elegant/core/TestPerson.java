package com.elegant.core;

class Person {
	int pan;
	String name;
	String address;

	Person(int pan, String name, String address) {
		pan = pan;
	    name = name;
		address = address;
	}

	void accessData() {
		System.out.println(pan);
		System.out.println(name);
		System.out.println(address);
	}

}

public class TestPerson {
	public static void main(String[] args) {
		Person person1 = new Person(67, "harita", "bang");
		person1.accessData();

	}

}
