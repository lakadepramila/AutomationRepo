package exceptionHandling;

public class ThrowAndThrowsKeyword {
	public static void main(String[] args) throws Exception {
		System.out.println("step 1");
		pause(-3000);
		System.out.println("step 2");
		
	}
	public static void pause(long miliSeconds) throws Exception
	{
		if (miliSeconds>=0){
			
	
		Thread.sleep(miliSeconds);
		}else{
			thorwException("Please Enter Positive Value");
		}
	}
	public static void thorwException(String message) throws Exception{
		throw new Exception(message);//use new to create object of exception
		
		
		
	}
}
