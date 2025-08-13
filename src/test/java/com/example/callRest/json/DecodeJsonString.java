package com.example.callRest.json;


import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

public class DecodeJsonString {

	public static void main(String[] args) throws JSONException {
		
		String jsonString = GenerateStringType.generateValidateCollectResponse();
		Gson gson = new Gson();
		JSONObject jsonObj = new JSONObject(jsonString);
		String txnId = (String) jsonObj.get("data");
		System.out.println(txnId);
		
//		JSONObject encJson = new JSONObject();
//		encJson.put("token", "123123");
//		JSONObject encJsonItem = new JSONObject();
//		encJsonItem.put("transactionId", txnId);
//		encJson.put("data", encJsonItem);
//		System.out.println("encJson : "+encJson);
		
	}
}
