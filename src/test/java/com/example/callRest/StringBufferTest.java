package com.example.callRest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBufferTest.stringBufferSizeTest();
		
	}
	
	
	public static void stringBufferSizeTest() {
		
//		List<String> listRRN = new ArrayList<>();
		Set<String> listRRN = new HashSet<>();

		System.out.println("time 1 :" + new Date());
		for (int i = 0; i <700000; i++) {
			listRRN.add(String.valueOf(System.currentTimeMillis()) + i);
		}

		
		
		System.out.println("time 2 :" + LocalDateTime.now());

		List<String> udf7StringList = new ArrayList<String>();
		StringBuffer udf7String = new StringBuffer();
		int i = 0;
		
		for (String string : listRRN) {
			if (i >= 5000) {
				udf7StringList.add(udf7String.toString());
				i = 0;
				udf7String = new StringBuffer();
			}
			if (i != 0) {
				udf7String.append(",");
			}
			udf7String.append("'" + string + "'");
			i++;
		}
		if (!udf7String.toString().equals("")) {
			udf7StringList.add(udf7String.toString());
		}
		System.out.println("time 3 :" +LocalDateTime.now());
		
		i = 0;
		String query = "hello_world_#ids_data";
		for (String string : udf7StringList) {
			
	
		query = "hello_world_#ids_data";
		query = query.replace("#ids", string);
		System.out.println("time 4 : "+i+" : " +LocalDateTime.now());
		}
	}
}
