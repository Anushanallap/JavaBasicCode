package SavingsAccount;

public class savingsaccounttest {
	


	public static void main(String[] args) {
		
		
		savings saver1=new savings(2000);
		savings saver2=new savings(4000);
		savings.modifyInterestRate(4);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displaySavings();
		saver2.displaySavings();
		savings.modifyInterestRate(5);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		saver1.displaySavings();
		saver2.displaySavings();
	}

	
	

}
