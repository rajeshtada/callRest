package com.example.callRest.anonymous;

class Food {
	
	String s;
	
	public Food(String s) {
		super();
		this.s = s;
	}

	public void taste() {
		System.out.println("This food is delicious.");
	}
}

public class Restaurant {
	public static void main(String[] args) {

		// Create an anonymous subclass overriding the taste method
		Food spicyFood = new Food("") {
			
			String s;
			
//			public Foods(String s) {
//				this.s = s;
//			}
			
			@Override
			public void taste() {
				System.out.println("This food is very spicy!");
			}
		};

		spicyFood.taste();
	}
}