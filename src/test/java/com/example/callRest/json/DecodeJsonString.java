package com.example.callRest.json;


import java.util.HashMap;

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
		
		
		String hashMapString = "{key1={subkey1=value1, subkey2=value2}, key2=value3}";
		String s2 = "{\"chnl\":\"FTK\",\"corpCode\":\"GTP\",\"beneinsert\":{\"apiVersion\":\"1.0\",\"beneCode\":\"FTK1600851\"}}";
		HashMap newHashMap = gson.fromJson(s2, HashMap.class);
		System.out.println(newHashMap);
		
	}
}
