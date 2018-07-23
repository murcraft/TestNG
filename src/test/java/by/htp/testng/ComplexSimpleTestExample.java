package by.htp.testng;

import org.testng.annotations.*;

public class ComplexSimpleTestExample {
	
	@Test(groups = { "group1", "group2" })
	public void testSomething2(){
		System.out.println("2- Test smth2");
	}
	
	@Test(groups = { "group1", "group2"})
	public void testSomething3(){
		System.out.println("2 - Test smth3");
	}
	
	@Test (groups = {"group1"})
	public void testSmthREg1(){
		System.out.println("2 - Test @AfterMethod");
	}


}
