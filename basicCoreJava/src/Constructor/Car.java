package Constructor;

public class Car {
	String model;
	String colour;
	String type;
	
	public Car(){
		
	}
	
	public Car(String model, String colour, String type)
	{
		this.model=model;
		this.colour=colour;
		this.type=type;
		
	}
 
	 public void specification()
	 {
		 System.out.println("The" +colour+" "+model+" is "+type);
		// System.out.println("The red Sedan is Automatic");
	 }

}
