package exceptionHandling;

import oops.abstractions.ICICI;

public class ExceptionHandling1 {
	static ICICI bank;
	public static void main(String[] args) {
		try{
			//Example1:ArithmeticException
			System.out.println(10/0);
			
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		try{
				
				//Example2:ArrayIndexOutOfBoundsException
				String[] arr=new String[2];
				arr[0]="Pramila";
				arr[1]="Lakade";
				//arr[2]="jknkfn";
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
				//Example3://Example3:NullPointerException
		try{	
				bank.creditCard();
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}


	}

}
