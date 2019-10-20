package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class SetInterface {
 
	@Test(priority=2)
	public void test1(){
		System.out.println("HashSet");
		
		Set<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		for(int a:set)//set doesnt allow duplicate entries & list allows duplicate entries
		{
			System.out.println(a);
		}
		System.out.println("**********************");
	}
	
	@Test (priority=0)
	public void test2(){
		System.out.println("LinkedHashSet");
		Set<Integer> set=new LinkedHashSet<>();
		set.add(20);
		set.add(30);
		set.add(10);
		for(int a:set)
		{
			System.out.println(a);
		}
		System.out.println("**********************");
	}

@Test//(priority=1)
public void test3(){
	System.out.println("TreeSet");
	
	Set<Integer> set=new TreeSet<>();
	set.add(30);
	set.add(10);
	set.add(20);
	
	for(int a:set)
	{
		System.out.println(a);
	}
	System.out.println("**********************");
 }
}