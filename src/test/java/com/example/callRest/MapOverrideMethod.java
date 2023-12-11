package com.example.callRest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapOverrideMethod {

	private static final Integer Integer1 = 0;

	public static void main(String[] args) {
		MapOverrideMethod mom = new MapOverrideMethod();
		mom.mapNullCheck();

	}

	public void mapOverrideCheck() {
		Geek g1 = new Geek("aditya", 1);
		Geek g2 = new Geek("aditya", 1);
		Geek g3 = new Geek("aditya", 1);
		System.out.println("hashValue = " + g1.hashCode() + " :: " + g2.hashCode());

		System.out.println(g1 + " :: " + g2);
		System.out.println(g1.equals(g2));
		System.out.println(g1 == g2);

//		   Geek g3 = g1; 
		Integer g1hash = Integer.valueOf(g1.hashCode());
		Integer g2hash = Integer.valueOf(g2.hashCode());
		System.out.println(g1hash.equals(g2hash));
		System.out.println(g1.equals(g2));
		System.out.println(g1 == g2);
		Map<Geek, String> map = new HashMap<Geek, String>();
		String put = map.put(g1, "CSE");
		String put2 = map.put(g2, "IT");
		String put3 = map.put(g3, "BSC");
		System.out.println(" _____ " + put + " put_put2 " + put2 + " _____" + put3 + "_____ ");

		for (Geek geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

		Map<String, String> maps = new HashMap<>();
		maps.put("hi", "hello");
		maps.put("hi", "good");
		maps.put("hi", "bye");

		Set<Entry<String, String>> entrySet = maps.entrySet();
		for (Entry<String, String> str : entrySet) {
			System.out.println(str.getKey().toString());
			System.out.println(str.getValue().toString());
		}

		Set<Geek> set1 = new HashSet<>();
		set1.add(g1);
		set1.add(g2);
		Iterator<Geek> iterator = set1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().id);
			System.out.println(iterator.next().name);
		}
		set1.forEach(data -> {
			System.out.println(data.id);
			System.out.println(data.name);
		});

	}

	public void mapNullCheck() {

		Map<String, Geek> map = new HashMap<>();

		Geek geek = map.get("hello");

		System.out.println(geek);
	}

}

class Geek {
	String name;
	int id;

	Geek(String name, int id) {
		this.name = name;
		this.id = id;
	}
//    @Override
//    public boolean equals(Object obj)
//    {
//    if(this == obj)
//            return true;
//        if(obj == null || obj.getClass()!= this.getClass())
//            return false;
//        Geek geek = (Geek) obj;
//        return (geek.name.equals(this.name)  && geek.id == this.id);
//    }
//    @Override
//    public int hashCode()
//    {
//        return this.id;
//    }
}
