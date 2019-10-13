package exceptionHandling;

import oops.abstractions.ICICI;

public class UncheckedException {
	static ICICI bank;//(we didint initialise to bank anywhere)
	
	public static void main(String[] args)
	{
		
		//Example1:ArithmeticException
		System.out.println(10/1);
		
		//Example2:ArrayIndexOutOfBoundsException
		String[] arr=new String[2];
		arr[0]="Pramila";
		arr[1]="Lakade";
		//arr[2]="jknkfn";
		
		//Example3://Example3:NullPointerException
		
		bank.creditCard();
		
	}

}
