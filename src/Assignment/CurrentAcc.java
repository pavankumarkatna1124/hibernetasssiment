package Assignment;

public class CurrentAcc extends Account {
	double overdraftLimit;

	public CurrentAcc(String accountNumber, String holderName, double balance, double overdraftLimit) {
		super(accountNumber, holderName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	void displayCurrentDetails() {
		displayAccountDetails();
		System.out.println("Overdraft Limit: " + overdraftLimit);
	}
}
