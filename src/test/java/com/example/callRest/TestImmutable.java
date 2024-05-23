package com.example.callRest;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hpsf.Array;

public class TestImmutable {

	
	
	public static void main(String[] args) {
		
		
		String str = "Hello";
	
		String str2 = new String("Rama");
		String  str3 = str;
		String str4 = "Hello";
		
		System.out.println(str + " str " + str.hashCode());
		System.out.println(str2 + " str2 " + str2.hashCode());
		System.out.println(str3 + " str " + str3.hashCode());
		System.out.println(str4 + " str2 " + str4.hashCode());
		
//		 str = str + "World";
//		 str2 = str2 + "World";
//		 
//		 System.out.println(str + " str " + str.hashCode());
//			System.out.println(str2 + " str2 " + str2.hashCode());	
//			
//			List<String> listStr = new ArrayList<>();
//			System.out.println(listStr.hashCode());
//			listStr.add(str);
//			System.out.println(listStr.hashCode());

			
	}
}
