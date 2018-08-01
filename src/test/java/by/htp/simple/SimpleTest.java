package by.htp.simple;

import static org.testng.Assert.fail;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
	
	@BeforeMethod(groups = {"login"})
	public void doSmth() {
		System.out.println("Before Method");
	}
	
	@Test(groups = {"login"})
	public void testSmth() {
		System.out.println("Test method");
		fail();
	}
	
	

}
