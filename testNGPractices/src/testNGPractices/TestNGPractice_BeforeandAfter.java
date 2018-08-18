package testNGPractices;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGPractice_BeforeandAfter {
		
	    @BeforeSuite
		public void BeforeSuite() {
		
		System.out.println("BeforeSuite");
	}
	    @BeforeTest
	    public void BeforeTest(){
		System.out.println("BeforeTest");
	}
	    @AfterSuite
		public void AfterSuite(){
		System.out.println("AfterSuite");
		}
		
	    @AfterTest
		public void AfterTest(){
		System.out.println("AfterTest");
		}
		
		
	}


