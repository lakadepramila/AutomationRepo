package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
public static void main(String[] args) throws InterruptedException,FileNotFoundException 
{
	System.out.println("Step 1");
	Thread.sleep(2000);

	System.out.println("Step 2");
	FileInputStream file= new FileInputStream("");
  
 
}
}
