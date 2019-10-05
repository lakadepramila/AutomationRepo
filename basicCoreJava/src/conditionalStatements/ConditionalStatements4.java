package conditionalStatements;

public class ConditionalStatements4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int a=9;
	int b=10;
	int c=30;//if condition not satisfied then statement will terminated	
	
	if(a>b){
		if(a>c){
			System.out.println("a is greatest");
		}else
		{
			System.out.println("c is greatest");
	}	
		}
	else if(b>c){
		System.out.println("b is greatest");
	}else{
		System.out.println("c is greatest");
	}
	}
		}
