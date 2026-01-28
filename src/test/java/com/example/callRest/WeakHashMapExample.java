package com.example.callRest;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {

		Map<String, String> weakMap = new WeakHashMap<>();

		String key = new String("hello");
		String value = "Metadata for key";

		weakMap.put(key, value);
		System.out.println("Map initially: " + weakMap);

		key = null;
		System.out.println("Strong reference removed. Invoking GC...");

		System.gc();

		try {
			Thread.sleep(1000); // Give GC a moment
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Map after potential GC: " + weakMap);
	}
}