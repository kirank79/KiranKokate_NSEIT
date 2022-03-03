package junitexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceTest {
	
		@BeforeClass
		public static void beforeAll() {
		System.out.println("This method is execute before all the methods in the test case...");
		}
		@AfterClass
		public static void afterAll() {
		System.out.println("This method is execute after all the methods in the test case...");
		}
		@Before
		public void testBefore() {
		System.out.println("This test is tested before every test method..");
		}
		@After
		public void testAfter() {
		System.out.println("This test is tested after every test method..");
		}

		 @Test
		public void test1() {
		System.out.println("inside the test1 method...");
		}
		@Test
		public void test2() {
		System.out.println("inside the test2 method...");
		}
		@Test
		public void test3() {
		System.out.println("inside the test3 method...");
		}

		
	}
