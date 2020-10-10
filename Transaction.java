////////////////custom exception

package exceptionuser;

public class Transaction {
	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposit(float amount) throws NegativeAmountException {
		if(amount < 0)
			throw new NegativeAmountException("Negative amount encountered");
		balance += amount;
		System.out.println("Balance= " + balance);
	}
	
	void withdraw(float amount) throws InSufficientFundsException{
		int minBalance=3000;
		if((balance-amount)<minBalance) 
			throw new InSufficientFundsException("Minimum Balance must be 3000");
		balance-=amount;
		System.out.println("Balance= "+balance);
		
	}
}
