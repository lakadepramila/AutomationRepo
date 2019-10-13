package oops.abstractions;

public class ICICI implements RBI {
	@Override
	public void SavingAccount() {
		System.out.println("ICICI saving account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI current account");
		
	}

	@Override
	public void creditCard() {
		System.out.println("credit card from ICICI");
	}

	@Override
	public void debitCard() {
		System.out.println("debit card from ICICI");
	}
	


}
