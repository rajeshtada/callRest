package com.example.callRest;

import java.util.HashMap;
import java.util.Map;

public class LamdaTest {
	
	public static void main(String[] args) {
		
		printMap();
	}

	
	public static void printMap() {
		
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("name", "rajesh");
		resultMap.put("city", "jaipur");
		
		resultMap.entrySet().forEach(entry->{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		});
		
	}
	
}
