package com.example.callRest.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Yash", "Amit", "Rakesh", "Suresh", "Mahesh");

		SortedTest st = new SortedTest();
		st.streamReverseSorting(names);
	}

	
	
	public void streamReverseSorting(List<String> names) {

		List<String> reverseSorted = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse sorted names: " + reverseSorted);
	}

	public void utilReverseSorting(List<String> names) {
		Collections.sort(names, Collections.reverseOrder());
		System.out.println("Reverse sorted names: " + names);
	}
	
	public void caseInsensitiveSort(List<String> names) {
		Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive sorted names: " + names);
	}
}
