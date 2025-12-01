package com.tnsif.testingdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// demo for all annotations
//1) @test
public class Testexample {
//	@Test
	void testaddition() {
		int reuslt=2+3;
		assertEquals(10, reuslt);
	}
	
	//2) @BeforeEach : Runs before every test cases
	
//	@BeforeEach
	void beforetest() {
		System.out.println("before test runnning ...");
	}
//	@Test
	void test1() {
		System.out.println("test 1 executed");
	}
//	@Test
	void test2() {
		System.out.println("test 2 executed");
		
	}

//3)@afterEach --- after every test case
	
//	@AfterEach
//	void afterTest() {
//		System.out.println("after test completed");
//	}
//	@Test
//	void testLogin() {
//		System.out.println("login test");
//	}
//	@Test
//	void testLogin1() {
//		System.out.println("login test1");
//	}
	
	//4) @BeforeAll --- Runs once before all tests(must be static)
	
//	@BeforeAll
//	static void setup() {
//		System.out.println("database connected");
//	}
//	@Test
//	void testLogin() {
//		System.out.println("login test");
//	}
//@Test
//	void testLogin1() {
//		System.out.println("login test1");
//	}
	
	// @Afterall - runs once after all tests finish

//@AfterAll
//static void setup() {
//	System.out.println("database connected");
//}
//@Test
//void testLogin() {
//	System.out.println("login test");
//}
//@Test
//void testLogin1() {
//	System.out.println("login test1");
//}
	
	
	// @Disabled - Used to skip/ignore test
	
	@Disabled("fixing bug, test skipped")
	@Test
	void skippedTest() {
		System.out.println("this should not run");
	}
//	
	@Test
	void testLogin() {
	System.out.println("login test");
	}
	@Test
	void testLogin1() {
		System.out.println("login test1");
	}
	
	}

