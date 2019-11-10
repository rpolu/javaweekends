package com.elegant.core;

class A {
	A() {
		System.out.println("from Constructor");
	}

	void m1() {
		System.out.println("from m1()");
	}
}

public class TestCon {

	public static void main(String[] args) {
		A a = new A();

	}

}
