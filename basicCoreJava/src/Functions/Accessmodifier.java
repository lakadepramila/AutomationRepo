package Functions;

public class Accessmodifier {

	public static void main(String[] args) 
	{
	Accessmodifier obj=new Accessmodifier();
	
	obj.publicFunction();
	obj.privateFuntion();
	obj.protectedFunction();
	obj.noAccessModFunction();
	
	}
	public void publicFunction(){
		System.out.println("Public Function");
	}
	private void privateFuntion()
	{
		System.out.println("Private Function");
	}
	protected void protectedFunction()
	{
		System.out.println("Protected Function");
	}
	void noAccessModFunction()
	{
		System.out.println("No access modifiers Function");
	}

}
