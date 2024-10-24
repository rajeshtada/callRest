package com.example.callRest.Inherite;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;


public class BatchStringConverter<T extends Serializable> {


	 public BatchStringConverter() {
	        final Class<T> type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	        if (!Serializable.class.isAssignableFrom(type)) {
	            throw new RuntimeException("T must extend Serializable");
	        }
	    }
	 
	public static void main(String[] args) throws Exception {
		
		List<String> listMap = new ArrayList<>();
		BatchStringConverter<String> testArg = new BatchStringConverter<String>();
		testArg.getBatchSizedListOfString(listMap);
		
		
	}
	
	public List<String> getBatchSizedListOfString(Collection< ? extends Serializable> listFields){
		
//		Collection< ? extends String>
		
		String elements = "";
		int i = 0;
		List<String> resultList = new ArrayList<>();
		
		for (Iterator<? extends Serializable> iterator = listFields.iterator(); iterator.hasNext();) {
			
			String next = iterator.next().toString();
			
			if (!elements.equals("")) {
				elements += ",";
			}
			elements += "'" + next + "'";
			i++;
			if (i >= 1000) {
				resultList.add(elements);
				i = 0;
				elements = "";
			}
			
		}
		if (!elements.equals("")) {
			resultList.add(elements);
		}
		
		return resultList;
	}
	
	public void testListMap() {
		List<Map<String, String>> listMap = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Map<String, String> map = new HashMap<>();
			map.put("key_"+String.valueOf(i), "value_"+String.valueOf(i));
			listMap.add(map);
		}
		System.out.println(listMap);
		ArrayList<Map<String,String>> arrayList = new ArrayList<>(listMap);
		for (Map<String, String> map : listMap) {
			if ( map.containsKey("key_2")) {
				System.out.println("removeing + "+map.get("key_2"));
				listMap.remove(map);
			}
		}
		System.out.println(listMap);
		Stream<Map<String, String>> stream = listMap.stream();
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Map<String, String> map = (Map<String, String>) iterator.next();
			
		}
	}
	


}
