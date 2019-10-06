package Functions;


	public class Car{
		
		String colour;
		static int Wheels;//4 wheels in all car
		String model;
		String brand;
		
	
		
		public void powerSteering() {
			//System.out.println("All 4 wheels support power steering");
			System.out.println("All "+Wheels+" wheels support power steering");

		}
		
		public void lookAndFeel() {
			//System.out.println("Maruti has white colour in sedan cars");
			System.out.println(brand+ " has " +colour+ " colour in sedan cars");

		}
		


}
