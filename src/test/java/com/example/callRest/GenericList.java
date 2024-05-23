package com.example.callRest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Iterator;
import java.util.List;

public class GenericList<T> implements Iterable<T>{

	public static void main(String[] args) {

		for (int i = 0; i < 25; i++) {

			GenericList.listTimeTest();
//			GenericList.encoded();
		}
	}

	public static void listTimeTest() {

		List<Vos> lst = new ArrayList<>(1000000);
		Vos vos ;
		LocalDateTime ldt = LocalDateTime.now();
//		System.out.println(" Start Time = " + ldt);
		for (int i = 0; i < 1000000; i++) {
			vos = new Vos();
			vos.setId(i);
			vos.setName(i+"ram");
			String detail = vos.toString();
			vos.setDetails(detail);
//			System.out.println(vos);
			lst.add(vos);
		}
//		System.out.println(" size = " + lst.size());
		LocalDateTime ldt2 = LocalDateTime.now();
//		System.out.println(" End Time = " + ldt2);

		Long diffTime = Long.valueOf(ldt2.getSecond() - ldt.getSecond()) * 1000000000
				+ Long.valueOf(ldt2.getNano() - ldt.getNano());

		System.out.println(diffTime);

	}
	
	public static void encoded() {
		String detail = "a";
		Encoder encoder = Base64.getEncoder();
		byte[] bytes = detail.getBytes();
		byte[] encode = encoder.encode(bytes);
		for (byte vos2 : encode) {
			System.out.println(vos2);
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	public <T> void testGeneric(String name) throws ClassNotFoundException {
		 Class c = Class.forName(name);
		
		 
		return ;
	}
	
	
}











class Vos { 
	private long id;
	private String name;
	private String details;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		return "vos [id=" + id + ", name=" + name + ", details=" + details + "]";
	}
	
	
	
}











//}






