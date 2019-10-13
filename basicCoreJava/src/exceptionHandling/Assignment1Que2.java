package exceptionHandling;

public class Assignment1Que2 {


		//What will be the output of following program?

				//public class Test {

				/**
				* @param args
				*/
	public static void main(String[] args) {

		try{
		int o[] = new int[2];
		o[3]=23;
		o[1]=33;
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		System.out.println(o[1]);
		}

}
