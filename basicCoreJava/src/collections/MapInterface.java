package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class MapInterface {
@Test (enabled=false)
	public void test1()
	{
	Map<String,String> map=new HashMap<String,String>();
	map.put("name1", "Pramila");
	map.put("name2", "Sowmya");
	//map.put(null, "Seema");
	map.put("name3", "Priyanka");
	map.put("name4", "Jyoti");
	

	Set<String> keys=map.keySet(); //keySet is returning set
	for(String key:keys)    
	 {
		System.out.println(map.get(key));//map.get(key)prints values 
	 }	
	}
 
@Test
public void test2()
{
Map<String,String> map=new Hashtable<String,String>();
map.put("name1", "Pramila");
map.put("name2", "Sowmya");
map.put(null, "Seema");
map.put("name3", "Priyanka");
map.put("name4", "Jyoti");


Set<String> keys=map.keySet(); //keySet is returning set
for(String key:keys)    
  {
	System.out.println(map.get(key));//map.get(key)prints values 
   }	
}



}
