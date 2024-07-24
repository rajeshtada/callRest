package com.example.callRest;

public class TryCatchTest {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("try + "+i);
				if ( i==2) {
					continue;
				}
			} finally {
				System.out.println("finally + "+i);
			}
			
		}
		
		
	}
}
