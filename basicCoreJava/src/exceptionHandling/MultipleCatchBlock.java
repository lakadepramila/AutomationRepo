package exceptionHandling;

import oops.abstractions.ICICI;

public class MultipleCatchBlock {
static ICICI bank;
	
	public static void main(String[] args)
	{
	
	try{
		
		//Example1:ArithmeticException
		System.out.println(10/1);
		
		//Example2:ArrayIndexOutOfBoundsException
		String[] arr=new String[2];
		arr[0]="Pramila";
		arr[1]="Lakade";
		//arr[2]="jknkfn";
		
		//Example3://Example3:NullPointerException
		
		bank.creditCard();
	}catch (ArithmeticException e){
		System.out.println(e.getMessage());
		
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		
	}catch(NullPointerException e){
		System.out.println(e.getMessage());
		
	}catch(Exception e){
	System.out.println(e.getMessage());
	}finally{
		System.out.println("Test case completed");
		System.out.println("Data base connection closed");
		System.out.println("Report Ending");
		System.out.println("Object Flush");
	}
	
  }
	
}
