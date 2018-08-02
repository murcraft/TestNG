package by.htp.simple;

import static org.testng.Assert.fail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.driver.DriverSingleton;

public class SimpleTest {
	
	@BeforeMethod(groups = {"login"})
	public void doSmth() {
		System.out.println("Before Method");
	}
	
	@Test(groups = {"login"})
	public void testSmth() {
		System.out.println("Test method");
		DriverSingleton.getDriver().get("https://mvnrepository.com");
		Logger logger = LogManager.getRootLogger();
        logger.info("Information message");
		fail();
	}
	
	

}
