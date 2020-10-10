package exceptionuser;

import java.util.Scanner;

public class TestTransaction {

	public static void main(String[] args) throws InSufficientFundsException, NegativeAmountException {

		String Pin = "1234";
		int count = 0;
		int n;
		Scanner sc = new Scanner(System.in);
		Transaction t = new Transaction();
		
		t.setBalance(10000.45f);
		
		while (count <= 3) {
			System.out.println("Enter PIN");
			String upin = sc.next();
			if (upin.equals(Pin)) {
				while(true) {
					System.out.println("1.deposit\n2.withdraw");
					n = sc.nextInt();
				
				switch (n) {
				case 1:
					try {
						System.out.println("Enter the amount to deposit");
						float dep=sc.nextFloat();
						t.deposit(dep);
					} catch (NegativeAmountException e) {
						e.printStackTrace();
						e.printException();
					}
					break;
				case 2:
					try {
						System.out.println("Enter amount to withdraw");
						float wd=sc.nextFloat();
						t.withdraw(wd);
					} catch (InSufficientFundsException e) {
						e.printStackTrace();
						e.printException();
					}
					break;
				}
				}

			} else {
				count++;
				System.out.println("Try again........");

			}
			if (count == 3) {
				System.out.println("Invalid Credentials");
				System.exit(0);
			}
		}

	}
}
