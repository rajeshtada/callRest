package com.example.callRest.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapMultiTest {

	public static void main(String[] args) {
		

		
		
	}
	
	public static void mapMulti() {

		Stream.of(1, 2, 3).mapMulti((number, consumer) -> {
		    consumer.accept(number + "a");
		    consumer.accept(number + "b");
//		    consumer.accept(number->number + "b");
		  }).forEach(System.out::println);
	}
	
	public static void mapMultiToInt() {
		
		Stream.of("1,2", "3,4").mapMultiToInt((s, consumer) -> {
		    Arrays.stream(s.split(",")).mapToInt(Integer::parseInt).forEach(consumer);
		  }).forEach(System.out::println);
	}
}
