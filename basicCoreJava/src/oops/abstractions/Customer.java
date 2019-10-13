package oops.abstractions;

public class Customer {

	public static void main(String[] args) {
		
		Customer obj=new Customer();
		obj.createAccount("HDFC");
		obj.createAccount("ICICI");
		obj.createAccount("VIjaya");
		
		/*RBI acc;
		
		acc=new Vijaya();
		acc.SavingAccount();
		acc.currentAccount();
		acc.creditCard();
		acc.debitCard();
		
		acc=new ICICI();
		acc.SavingAccount();
		acc.currentAccount();
		acc.creditCard();
		acc.debitCard();
		
		acc=new HDFC();
		acc.SavingAccount();
		acc.currentAccount();
		acc.creditCard();
		acc.debitCard();
	
*/	
	}
	public void createAccount(String bankName)
	{

      RBI acc=null;
       if(bankName.equals("Vijaya"))
       {
    	   acc=new Vijaya();
    	   
       }
    	   else if(bankName.equals("ICICI"))
    	   {
    		   acc= new ICICI();
    	   }    	   else if(bankName.equals("HDFC"))
    	   {
    		   acc= new HDFC();

    		   
       }
		acc=new Vijaya();
		acc.SavingAccount();
		acc.currentAccount();
		acc.creditCard();
		acc.debitCard();
		
	}
	

}
