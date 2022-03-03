package junitexamples;

import junit.framework.Test;

public class TestCase2 {
	@Test
	@Ignore
	public void test4() {
	System.out.println("Inside the test4");
	}
	@Test(expected= NullPointerExceptionException.class)
	public void test5() {
	System.out.println("Inside the test5");
	int a=10/2;
	String str = null;
	str.equals("hello");
	}

}
