package exceptionuser;

public class InSufficientFundsException extends Exception {
	public InSufficientFundsException() {

	}

	public InSufficientFundsException(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace() {
		System.out.println("Printing the stack trace");
		super.printStackTrace();
	}

	public void printException() {
		System.out.println("The exception was caused by the minimum balance");
	}
}
