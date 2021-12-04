package SavingsAccount;

public class savings {
	
		private static float annualInterestRate;
		private float savingsBalance;
		private float monthlyInterest;

		// This parameterized constructor is used to initialize the value of savingsBalance

		public savings (float balance) {
			this.savingsBalance = balance;
		}

		// This static method is used to set the annualInterestRate The interest is divided by 100 to change it to real value.

		public static void modifyInterestRate(float interestRate) {
			annualInterestRate = interestRate / 100; 
		}

		// This method calculates the monthly interest on savings.

		public void calculateMonthlyInterest() {
			monthlyInterest = savingsBalance * annualInterestRate / 12;
			System.out.println("The monthly interest is: $" + monthlyInterest);
		}

		// This method adds the monthly interest to the total savings.

		private void calculateSavings() {
			savingsBalance += monthlyInterest;
		}

		// This method displays the total savingsBalance

		public void displaySavings() {
			calculateSavings();
			System.out.println("The total balance is : $ " + savingsBalance);
		}

	}



