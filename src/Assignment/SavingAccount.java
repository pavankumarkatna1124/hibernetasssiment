package Assignment;

	public class SavingAccount extends Account{
		double interestRate;
	   public SavingAccount(String accountNumber, String holderName, double balance,double interestRate) {
			  super(accountNumber, holderName, balance);
			  this.interestRate=interestRate;
		}   
	   void displaySavingsDetails() {
	       displayAccountDetails();
	       System.out.println("Interest Rate  : " + interestRate + "%");
	   }
	}

