package Functions;

public class NonStaticFunctions {

	public static void main(String[] args) {
		
		NonStaticFunctions obj=new NonStaticFunctions();
		int add=obj.sum(10,20);
		System.out.println(add);
		
		Functions1.sum(10,20);
		
		//same funtion from outside/diff class 
	}
public int sum(int a, int b ){
	return a+b;	
}
}
