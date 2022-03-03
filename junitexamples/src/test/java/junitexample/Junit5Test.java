package junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junit5Test {

	@BeforeAll
	public static void testBeforeAll() {
	System.out.println("This test will be executed at class level before all tests");
	}

	 @Test
	void test1() {
	System.out.println("Inside the junit5-Test1");
	}
	@Test
	void test2() {
	System.out.println("Inside the junit5-Test2");
	}
	@BeforeEach
	public void testBefore() {
	System.out.println("test is execute before each test method..");
	}
	@AfterEach
	public void testAfter() {
	System.out.println("test is execute before each test method..");
	}
	@AfterAll
	public static void testAfterAll() {
	System.out.println("This test will be executed at class level after all tests");
	}
}
