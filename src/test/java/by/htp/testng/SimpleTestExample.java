package by.htp.testng;

import org.testng.annotations.*;

public class SimpleTestExample {
	

	
	@BeforeSuite
	public void testSmthBS(){
		System.out.println("Test @BeforeSuite");
	}
	
	@AfterSuite
	public void testSmthAS(){
		System.out.println("Test @AfterSuite");
	}
	
	@BeforeTest
	public void testSmthBT(){
		System.out.println("Test @AfterTest");
	}
	
	@AfterTest
	public void testSmthAT(){
		System.out.println("Test @AfterTest");
	}
	
	@BeforeGroups
	public void testSmthBG(){
		System.out.println("Test @BeforeGroups");
	}
	
	@AfterGroups
	public void testSmthAG(){
		System.out.println("Test AfterSuite");
	}
	
	@BeforeClass
	public void testSmthBCL(){
		System.out.println("Test @BeforeClass");
	}
	
	@AfterClass
	public void testSmthACl(){
		System.out.println("Test @AfterClass");
	}
	
	@BeforeMethod
	public void testSmthBMeth(){
		System.out.println("Test @BeforeMethod");
	}
	
	@AfterMethod
	public void testSmthAMeth(){
		System.out.println("Test @AfterMethod");
	}
	
	@Test(groups = { "chrome", "firefox" })
	public void testSmth1(){
		System.out.println("Test smth1");
	}
	
	@Test(groups = { "chrome", "firefox" })
	public void testSomething2(){
		System.out.println("Test smth2");
	}
	
	@Test(groups = { "chrome"})
	public void testSomething3(){
		System.out.println("Test smth3");
	}
	
	@Parameters({"login", "pass"})
	@Test(groups = { "chrome.login", "firefox.login" })
	public void testSmthW(String l, String p){
		System.out.println("Test-1 smth1");
		System.out.println("Params: " + l + " " + p);
	}
	
	@Parameters({"login", "pass"})
	@Test(groups = { "chrome.login", "firefox.login" })
	public void testSomething2W(String l, String p){
		System.out.println("Test-1 smth2");
		System.out.println("Params: " + l + " " + p);
	}
	
	@Test(groups = { "chrome.logout", "firefox.logout" })
	public void testSomething3W(){
		System.out.println("Test-1 smth3");
	}
	
	@Parameters({"xVal"})
	@Test(groups = { "chrome.login", "firefox.login" })
	public void testSomething(@Optional("5") int x){
		System.out.println("Test-1 smth3");
		System.out.println("xVal = " + x);
	}

	
	
//	@DataProvider
//	public void testSmthDataPr(){
//		System.out.println("Test @DataProvider");
//	}
	
//	@Factory
//	public void testSmthFactory(){
//		System.out.println("Test @Factory");
//	}
//	

}
