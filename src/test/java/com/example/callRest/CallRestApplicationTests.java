package com.example.callRest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CallRestApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void sampleTest() {
		int expVal = 15;
		int actVal = 3 * 5;
		assertEquals(expVal, actVal);
	}

	@BeforeEach
	private void setUp() {
		System.out.println("test start");
	}

	@AfterEach
	private void trimUp() {
		System.out.println("test end");
	}

}
