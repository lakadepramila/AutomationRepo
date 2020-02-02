package BasicTestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImageStatus {
	
	@BeforeTest
	public void beforeStatusModule(){
	
	System.out.println("Galary should be accessible");
	}
	
	@AfterTest
	public void AfterStatusModule(){
	
	System.out.println("After chat module");
	}
	
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Pre Condition for Image status");
	}
	
	@AfterClass
	public void AfterClass(){
		System.out.println("Post Condition for Image status");
	}
	
	@BeforeMethod
	public void preConditionForTestCase(){
		System.out.println("Keypad should be enabled");
	
	}
	
	@AfterMethod
	public void postConditionForTestCase(){
		System.out.println("Keypad should be disabled");
		System.out.println();
	}
	@Test
	public void test1()
	{
	 System.out.println("Image Status Test Case1");	
	}
	
	@Test
	public void test2()
	{
	 System.out.println("Image Status Test Case2");	
	}
	
	@Test
	public void test3()
	{
	 System.out.println("Image Status Test Case3");	
	}

}
