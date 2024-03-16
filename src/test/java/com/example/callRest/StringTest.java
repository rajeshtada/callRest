package com.example.callRest;

import java.lang.instrument.Instrumentation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class StringTest {

	public static void main(String[] args) {

		String s1 = null;

		Map<String, String> map = new HashMap<>();
		System.out.println(s1);
		map.put("a1", "a1");
		map.put("b1", "b1");
//		map.forEach((k,v)-> keys = keys+" , " + k);

		VosTest vo = new VosTest();
		vo.setId(0L);
		vo.setName("test");
		vo.setDetails("testing");

//		long objectSize = InstrumentationAgent.getObjectSize(map);
//		System.out.println(objectSize);

//		Gson gson = new Gson();
//		VosTest vo2 = new VosTest();
////	vo2.setDetails("test");
////	vo2.setName("ok");
//		String json = gson.toJson(vo2);
//		String g1= "{\"name\":\"ok\",\"details\":\"test\"}";
//		VosTest fromJson = gson.fromJson(json, VosTest.class);
//		System.out.println(fromJson);

		String jsonString = "{\"response\": [\"test1\", \"test2\"]}";

		Gson gson = new Gson();
		
		 MyResponse myResponse = gson.fromJson(jsonString, MyResponse.class);
		 System.out.println(myResponse);
	}

}

class VosTest {
	private Long id;
	private String name;
	private String details;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "vosTest [id=" + id + ", name=" + name + ", details=" + details + "]";
	}
}

class InstrumentationAgent {
	private static volatile Instrumentation globalInstrumentation;

	public static void premain(final String agentArgs, final Instrumentation inst) {
		globalInstrumentation = inst;
	}

	public static long getObjectSize(final Object object) {
		if (globalInstrumentation == null) {
			throw new IllegalStateException("Agent not initialized.");
		}
		return globalInstrumentation.getObjectSize(object);
	}
}

class MyResponse {
    private List<String> response;

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

	@Override
	public String toString() {
		return "MyResponse [response=" + response + "]";
	}

    
    
}
