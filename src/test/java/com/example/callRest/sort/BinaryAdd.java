package com.example.callRest.sort;

public class BinaryAdd {

	        
	public static void main(String[] args) {
		
//		String s = "test";
//		byte[] bytes = s.getBytes();
//		for (byte b : bytes) {
//			System.out.println(b);
//		}
		
//		String test = "100";
//		int int1 = Integer.parseInt(test, 2);
//		System.out.println(int1);
		Integer int1 = 3;
		String binaryString = Integer.toBinaryString(int1);
		System.out.println(binaryString);
		
		 int1 = -3;
		 binaryString = Integer.toBinaryString(int1);
		System.out.println(binaryString);
		
		
	}
}
