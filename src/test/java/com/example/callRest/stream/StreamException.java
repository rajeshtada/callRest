package com.example.callRest.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamException {

	public static void main(String[] args) {
		
		List<String> asList = Arrays.asList("one","two");
		
		Stream<String> stream = asList.stream();
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
	}
}
