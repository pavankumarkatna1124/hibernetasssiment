package Assignment;

public class BankDetailsDisplay {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount("S101", "sneha", 32423.43, 5.6);
		CurrentAcc c = new CurrentAcc("C101", "Priya", 50000, 10000);

		System.out.println("----- SAVINGS ACCOUNT -----");
		s.displaySavingsDetails();

		s.deposit(5000);

		System.out.println("\nAfter Deposit:");
		s.displaySavingsDetails();

		System.out.println("\n----- CURRENT ACCOUNT -----");
		c.displayCurrentDetails();

		c.deposit(10000);

		System.out.println("\nAfter Deposit:");
		c.displayCurrentDetails();
	}
}