package oops.abstractions;

public class HDFC implements RBI {

	@Override
	public void SavingAccount() {
		System.out.println("HDFC saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("HDFC current account");
		
	}

	@Override
	public void creditCard() {
		System.out.println("credit card from HDFC");
	}

	@Override
	public void debitCard() {
		System.out.println("debit card from HDFC");
	}

}
