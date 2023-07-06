package com.example.callRest;

import static org.mockito.ArgumentMatchers.matches;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.apache.poi.hpsf.Array;

public class InnerClassTest {

	public static void main(String[] args) {

		BigDecimal bigDecimal = new BigDecimal("2.5");
		System.out.println(bigDecimal.toString());

		Map<Object, Object> map = new HashMap<>();

		InnerClassTest jst = new InnerClassTest();
//		JustTrial.Geeknn g1 = new Geeknn("aditya", 1);
		InnerClassTest.Geeknn g1 = jst.new Geeknn("aditya", 1);
		Geeknn g2 = jst.new Geeknn("aditya", 1);

//		Geeknn g1 = new Geeknn("aditya", 1);
//		Geeknn g2 = new Geeknn("aditya", 1);
		map.put(g1, g2);
		System.out.println(map);

		g1.id = 111;
		System.out.println(map);

		List<Geeknn> listgeeknn = new ArrayList<>();
		listgeeknn.add(g1);
//		System.out.println(listgeeknn);

//		g1.setId(111);;
//		System.out.println(listgeeknn);

	}

	class Geeknn {
		String name;
		int id;

		Geeknn(String name, int id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Geeknn [name=" + name + ", id=" + id + "]";
		}
	}

}
