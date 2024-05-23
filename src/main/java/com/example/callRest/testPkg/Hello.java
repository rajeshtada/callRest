package com.example.callRest.testPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Helo World");
		
		List<String> lst = new ArrayList<>();
		lst.add("ram");
		lst.add("hari");
		lst.add("dada");
		lst.add("namo");
		
		List<String> collect2 = lst.stream().map(x->"Name : "+x).collect(Collectors.toList());
		System.out.println(collect2);
		
		Stream<String> stream = lst.stream();
		Stream<String> limit = stream.limit(2);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> collect = number.stream().map(y->y*y).collect(Collectors.toList());
		 
		System.out.println(collect);
		
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		
//		String hari = "0123456789";
//		System.out.println(hari.substring(2));
//		System.out.println(hari.substring(2,4));

		
		
	}
}
