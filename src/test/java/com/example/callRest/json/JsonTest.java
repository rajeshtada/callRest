package com.example.callRest.json;


import org.json.JSONException;
import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonTest {

	public static void main(String[] args) throws JsonProcessingException, JSONException {
		
//		JSONObject validateCollectJsonReq = new JSONObject();
//		validateCollectJsonReq.put("data1", "1");
//		validateCollectJsonReq.put("data3", "3");
//		validateCollectJsonReq.put("data4", "4");
//		validateCollectJsonReq.put("data2", "2");
//		validateCollectJsonReq.put("newData2", "n2==");
//		System.out.println("validateCollectJsonReq : "+validateCollectJsonReq.toString());
//		
//		JsonTest jt = new JsonTest();
//		Gson gson = new Gson();
//        MyObject obj = jt.new MyObject("Charlie==", 40);
//        String jsonString = gson.toJson(obj);
//        System.out.println(jsonString); // Output: {"name":"Charlie","age":40}
//		
//		
//        ObjectMapper objectMapper = new ObjectMapper();
//        
//        // Ignore fields with null values
//        objectMapper.setSerializationInclusion(Include.NON_NULL);
//        MyObject obj1 = jt.new MyObject(null, 40);
//        String json = objectMapper.writeValueAsString(obj1);
//        System.out.println(json); // Output: {"id":1}
        
        String jsonString = "{\"type\":\"GSTN\",\"value\":\"27BBBBB0000A1Z6\"}";
        JSONObject jsonObject = new JSONObject(jsonString);
        System.out.println(jsonObject.toString());
        
	}
	
    class MyObject {
        public String name;
        public int age;

        public MyObject(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
