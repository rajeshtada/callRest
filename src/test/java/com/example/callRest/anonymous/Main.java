package com.example.callRest.anonymous;

public class Main {
	public static void main(String[] args) {

		// Create an anonymous class that implements the Greeting interface
		Greeting englishGreeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello World!");
			}
		}; // Semicolon is required here because it is an expression

		englishGreeting.sayHello();
	}
}