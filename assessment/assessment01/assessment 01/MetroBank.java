package assessment;

public class MetroBank {
	
	public void calculateLoan(long accountNumber, double salary, double accountBalance, String loanType, double loanAmountExpected, float CustomerExpectedEMI) {
		
		int EligibleLoanAmount = 0;
		int EMI = 0;
		int flag = 0;
		
		if (accountNumber > 999 && accountNumber <= 1999) {
	        if (accountBalance >= 1000) {
	            if (loanType.equals("Car") && salary > 25000) {
	                if (CustomerExpectedEMI <= 36 && loanAmountExpected <= 500000) {
	                    EligibleLoanAmount = 500000;
	                    EMI = 36;
	                    flag = 1;
	                } else {
	                    System.out.println("You're not eligible for the loan");
	                }
	            } else if (loanType.equals("House") && salary > 50000) {
	                if (CustomerExpectedEMI <= 60 && loanAmountExpected <= 6000000) {
	                    EligibleLoanAmount = 6000000;
	                    EMI = 60;
	                    flag = 1;
	                } else {
	                    System.out.println("You're not eligible for the loan");
	                }
	            } else if (loanType.equals("Business") && salary > 75000) {
	                if (CustomerExpectedEMI <= 84 && loanAmountExpected <= 7500000) {
	                    EligibleLoanAmount = 7500000;
	                    EMI = 84;
	                    flag = 1;
	                } else {
	                    System.out.println("You're not eligible for the loan");
	                }
	            } else {
	                System.out.println("Invalid loan type or salary");
	            }
	        } else {
	            System.out.println("Insufficient account balance");
	        }
	    } else {
	        System.out.println("Invalid account number");
	    }

	    if (flag == 1) {
	        System.out.println("The customer can avail the amount of Rs. " + EligibleLoanAmount);
	        System.out.println("Eligible EMIs: " + EMI);
	    }
	}
		
}
