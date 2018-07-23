package by.htp.testng;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;

import by.htp.entity.Letter;

public class TestDataProviderExample {
	
	private Letter expected;
	// 1й тест
	@DataProvider(name = "arrayData")
	public Object[][] arrayTestData(){
		Object[][] data = new Object[][]{
				{"user1", "pass1"},
				{"user2", "pass2"},
				{"user3", "pass3"},
		};
		return data;
	}
	
	
	@Test(dataProvider = "arrayData", enabled=false)
	public void doSmth(String login, String pass){
		System.out.println("login: " +login + ", " + "pass: " + pass);
	}
	//2-й тест
	@DataProvider(name="collectionData")
	public Iterator<String> collectionTestData(){
		List<String> data = new ArrayList<String>();
		data.add("user1");
		data.add("user2");
		data.add("user3");
		return data.iterator();
	}
	
	@Test(dataProvider="collectionData",  enabled=false)
	public void doSmthCp(String login){
		System.out.println("login: " + login);
	}
	
	//3-й тест с классом Letter
	@DataProvider(name="letters")
	public Iterator<Letter> lettersTestData(){
		List<Letter> data = new ArrayList<Letter>();
		data.add(new Letter("1@mail.ru", "subject1", "text1"));
		data.add(new Letter("2@mail.ru", "subject2", "text2"));
		data.add(new Letter("3@mail.ru", "subject3", "text3"));
		return data.iterator();
	}
	
	@BeforeMethod
	public void initSendLetterExpectedData(){
		expected = new Letter("1@mail.ru", "subject1", "text1");
	}
	
	@Test(dataProvider = "letters")
	public void testSendLetter(Letter actual){
		System.out.println("letter: " + actual);
		Assert.assertEquals(actual, expected);
	}
	
	

}
