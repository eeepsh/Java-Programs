package jan2017.prob2.Polymorphism;

public final class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	
	@Override
	public double getBalance() {
		return balance;
	}
}
