package Assignment;

	public class Account {
		protected String accountNumber;
		protected String holderName;
		protected double balance;

		public Account(String accountNumber, String holderName, double balance) {
			this.accountNumber = accountNumber;
			this.holderName = holderName;
			this.balance = balance;
		}

		void deposit(double amount) {
			balance = balance + amount;
		}

		void displayAccountDetails() {
			System.out.println("Account Number : " + accountNumber);
			System.out.println("Holder Name    : " + holderName);
			System.out.println("Balance        : " + balance);
		}
	}

