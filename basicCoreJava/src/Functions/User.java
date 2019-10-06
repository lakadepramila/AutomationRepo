package Functions;


public class User {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="Maruti";
		//car1.Wheels=4;
		car1.colour="Red";
		car1.model="Sedan";
		car1.powerSteering();
		car1.lookAndFeel();
		
		Car car2=new Car();
		car2.brand="Honda"; //default value of string is null
		car2.Wheels=4;//static value has access of global value i.e 4
		car2.colour="Black";
		car2.model="SV";
		car2.powerSteering();
		car2.lookAndFeel();
		
	}

}
