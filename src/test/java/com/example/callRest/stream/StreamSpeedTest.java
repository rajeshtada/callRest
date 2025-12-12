package com.example.callRest.stream;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamSpeedTest {

	public static void main(String[] args) throws Exception {

		System.out.println("code start : " + LocalDateTime.now());

		try (Scanner scanner = new Scanner(System.in)) {
//			String input = scanner.next();

			String[] dummyArray = getDummyArray();
			List<String> dummyList = getDummyList();
			
			LocalDateTime nowStart = LocalDateTime.now();
			System.out.println("test start : " + nowStart);
			
			for (int i = 0; i < dummyArray.length; i++) {
			}
//			for (String string : dummyList) {
//			}
//				List<String> list = new ArrayList<>();
//				for (String string : dummyList) {
//					System.out.println("123312");
//					list.add(string + "new");
//				}

//			List<String> list = dummyList.stream().map(x->x+"new").collect(Collectors.toList());
//			List<String> list = dummyList.parallelStream().map(x -> x + "new").collect(Collectors.toList());
//			System.out.println(list.size());
			
//			sequentialLoop();
//			parallelStream();
			
			LocalDateTime nowEnd = LocalDateTime.now();
			System.out.println("test end : " + nowEnd);

			long differenceInMillis = ChronoUnit.NANOS.between(nowStart.atZone(ZoneId.systemDefault()).toInstant(),
					nowEnd.atZone(ZoneId.systemDefault()).toInstant());
			System.out.println("test duration : " + differenceInMillis);

		}
	}

	public static List<String> getDummyList() {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < 20000000; i++) {
			list.add("value:" + i);
		}
		return list;
	}
	
	public static String[] getDummyArray() {

		int j = 20000000;
		String[] ary = new String[j];
		for (int i = 0; i < j; i++) {
			ary[i] = "value:" + i;
		}
		return ary;
	}

	public static void sequentialLoop() {
		// Sample emails
		List<String> emails = Arrays.asList("user1@gmail.com", "invalid@", "test@yahoo.com", "hello.world",
				"user2@outlook.com", "demo@company.org", "wrong.email", "contact@site.net");

		long start = System.currentTimeMillis();

		List<String> validEmails = emails.stream() // sequential
				.filter(StreamSpeedTest::isValidEmail).toList();

		long end = System.currentTimeMillis();

		System.out.println("Valid Emails (Sequential): " + validEmails);
		System.out.println("Time: " + (end - start) + " ms");
	}

	public static void parallelStream() {
		// Sample emails
		List<String> emails = Arrays.asList("user1@gmail.com", "invalid@", "test@yahoo.com", "hello.world",
				"user2@outlook.com", "demo@company.org", "wrong.email", "contact@site.net");

		long start = System.currentTimeMillis();

		List<String> validEmails = emails.parallelStream() // parallel
				.filter(StreamSpeedTest::isValidEmail).toList();

		long end = System.currentTimeMillis();

		System.out.println("Valid Emails (Parallel): " + validEmails);
		System.out.println("Time: " + (end - start) + " ms");
	}

	// Simulate heavy validation task
	private static boolean isValidEmail(String email) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		return email.contains("@") && email.contains(".");
	}
}
