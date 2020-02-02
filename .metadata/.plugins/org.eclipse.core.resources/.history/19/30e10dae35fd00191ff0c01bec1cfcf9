package BasicAPITesting;

import org.testng.Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions{
	
	int a=10;
	int b=20;
    int c=30;
    
	@Test
	public void test1()
	{
		//Hard Assertion
	System.out.println("Step 1");
	Assert.assertEquals(11,a );
	
	System.out.println("Step 2");
	Assert.assertEquals(21,b );
	
	System.out.println("Step 3");	
	Assert.assertEquals(30,c );
	}
	
	@Test
	public void test2()
	{
		SoftAssert asr=new SoftAssert();
		
		System.out.println("Step 1");
		asr.assertEquals(11,a);
		
		System.out.println("Step 2");
		asr.assertEquals(21,b);
		
		System.out.println("Step 3");	
		asr.assertEquals(30,c);
		asr.assertAll();
		}
		
	}

