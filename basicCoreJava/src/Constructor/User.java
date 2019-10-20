package Constructor;

public class User {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.colour="Red";
		car1.model="Sedan";
		car1.type="Automatic";
		car1.specification();
		
		
		Car car2=new Car();
		car2.colour="White";
		car2.model="Hatchback";
		car2.type="Automatic";
		car2.specification();
		
		Car car3=new Car();
		car3.colour="Red";
		car3.model="SUV";
		car3.type="Automatic";
		car3.specification();
	
		
		Car car4=new Car("Sedan", "Black", "Manual");
		car4.specification();
		
		
	}

	private static void Car() {
		// TODO Auto-generated method stub
		
	}

}
