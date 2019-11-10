package com.elegant.core;
class Student {
	int rollNum;
	String name;
	String address;
	
	Student(int rollNum, String name) {
		this.rollNum = rollNum;
		this.name = name;
		System.out.println("from 1 ");
	}
	Student(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("from 2 ");
	}

	Student() {
		System.out.println("from 3");
	}

	void display() {
		System.out.println(rollNum);
		System.out.println(name);
		System.out.println(address);
	}

}

public class TestConOver {

	public static void main(String[] args) {
		Student student = new Student("Harita", "Banglore");
		student.display();
	}

}
