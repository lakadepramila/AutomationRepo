package conditionalStatements;

import java.util.Scanner;

public class LogicalOperator2 {

	public static void main(String[] args) 
	{
       int IIT=90;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter your CET score");
    
    int cet=sc.nextInt();
    if(cet>=80|| IIT>=40)
    {
    System.out.println("You are Eligible");
    }else{
    	System.out.println("You are not eligible");
    }
    
	}

}
