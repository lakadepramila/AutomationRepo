package Functions;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10, 30);
		

	}

	public void sum(int a, int b)
	{
		
		System.out.println(a+b);
	}
	
	public void sum(int a, int b, int c)
	{
		
		System.out.println(a+b);
	}
}
