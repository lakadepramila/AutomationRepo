package Functions;

public class Functions1 {

	public static void main(String[] args)
	{
	int a=sum(10,20);//calling function in main
	int b=sum(30,40);
		System.out.println(a+b);
	
	NonStaticFunctions obj=new NonStaticFunctions();
	System.out.println(obj.sum(10,20));
	
	}
 /*	public static void sum(int a,int b)
	{
		
		int sum =a+b;
		System.out.println(sum);
	}
	*/
	public static int sum(int a,int b)
	{
		
		int sum =a+b;
		return sum;
	}
	

}
