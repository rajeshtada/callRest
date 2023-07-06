package com.example.callRest;

public class StringTest {

	
	public static void main(String[] args) {
		
		
		String s1 = "ram"; 
		System.out.println(s1 + " hash " + s1.hashCode());
		
		String s2 = new String("hari"); 
		System.out.println(s2 + " hash " + s2.hashCode());
		
		 s2 = s1; 
		System.out.println(s2 + " hash " + s2.hashCode());
		
//		s2.value
		
		Object obj = new String("ram");
		
		System.out.println(obj.hashCode());
	}
}
