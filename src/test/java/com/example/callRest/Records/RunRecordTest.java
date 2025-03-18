package com.example.callRest.Records;

import com.google.gson.Gson;

public class RunRecordTest {

	public static void main(String[] args) {
		
		System.out.println(" 1 "+new TestRecord("hello"));
		System.out.println(" 2 "+new TestRecord1<String>("hello2"));
		System.out.println(" 3 "+new TestRecord1<Integer>(1));
		Gson gson = new Gson();
//		String json = gson.toJson(gson);
//		System.out.println("json : "+json);
		
		String json2 = gson.toJson(new TestRecord1<Integer>(1));
		System.out.println("json2 : "+json2);
	}
}
