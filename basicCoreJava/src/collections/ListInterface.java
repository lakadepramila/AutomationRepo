package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class ListInterface {
	
	
	
	@Test(enabled=false)// enabled =false is used to remove form run test case
	public void test()
	{
		List list=new ArrayList<>();//list is interface, arrayList is class,
		//we can not create object of list/interface
		list.add("Pramila");
		list.add(10);
		list.add(true);
		list.add(new ListInterface());
		//we can store anytype of data in list e.g int, string, boolean,class
		
	}
	@Test
	public void test2()
	{
		List<String> list=new ArrayList<>();
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
		
		//in this there is no fix size to store value
	
	for(String s:list)//enhanced for loop
	  {
		System.out.println(s);
	  }
	System.out.println();
	}
	
	@Test
	public void test3()
	{
		List<String> list=new LinkedList<>();
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
	for(String s:list)//enhanced for loop
	  {
		System.out.println(s);
	  }
	System.out.println();
	}
	@Test
	public void test4()
	{
		List<String> list=new Vector<>();
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
		list.add("Pramila");
		list.add("Lakade");
		list.add("Techbodhi");	
	for(String s:list)//enhanced for loop
	  {
		System.out.println(s);
	  }
	System.out.println();
	}

	
}
