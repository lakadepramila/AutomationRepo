package BasicTestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupChat
{
	
	@BeforeTest
	public void beforeChatModule(){
	
	System.out.println("Contacts should be loaded");
	System.out.println();
	}
	
	@AfterTest
	public void AfterChatModule(){
	
	System.out.println("After chat module");
	System.out.println("****************************************************");
	}
	
	//only once before test execution
	@BeforeClass
	public void beforeClass(){
		System.out.println("Create Group");
	}
	
	//only once after test execution
	@AfterClass
	public void AfterClass(){
		System.out.println("Delete Group");
		System.out.println();//it will give blank space between row
		
	}
	
	//before every test case
	@BeforeMethod
	public void preConditionForTestCase(){
		System.out.println("Keypad should be enabled");
	
	}
	
	//after every test case
	@AfterMethod
	public void postConditionForTestCase(){
		System.out.println("Keypad should be disabled");
		System.out.println();
	}
	
	//Test case 
	@Test
	public void test1()
	{
	 //System.out.println("Group chat Test Case1");	
	 throw new SkipException("Group Chat Test Case 1");
	
	}
	
	//Test case
	@Test
	public void test2()
	{
	 System.out.println("Group chat Test Case2");	
	 System.out.println(10/0);
	}
	
	//Test case
	@Test
	public void test3()
	{
	 System.out.println("Group chat Test Case3");	
	}
	
}
