package com.example.callRest.json;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectUse {

	
	public static void main(String[] args) throws Exception {
		
		String jsonPayload = "";
		JSONObject jsonObj = new JSONObject(jsonPayload);

		JSONObject headObj = jsonObj.getJSONObject("head");
//		Map<String, Object> head = headObj.toMap();

//		String msgID = (String) head.get("msgID");

		
		
	}
}
