package assessment;
import java.util.Scanner;

public class MetroBankLoanTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Account number: ");
		long AccountNumber = sc.nextLong();
		System.out.println("Salary: " );
		double Salary = sc.nextDouble();
		System.out.println("Account Balance: ");
		double AccountBalance = sc.nextDouble();
		System.out.println("Loan Type: ");
		String Type = sc.next();
		System.out.println("Expected loan amount: ");
		double ExpectedLoanAmount = sc.nextDouble();
		System.out.println("Expected No' EMI: ");
		float ExpectedEMI = sc.nextFloat();
		
		MetroBank c1 = new MetroBank();
		c1.calculateLoan(1001, 40000, 250000, "Car", 300000, 30);
		MetroBank c2 = new MetroBank();
		c2.calculateLoan(AccountNumber, Salary, AccountBalance, Type, ExpectedLoanAmount,ExpectedEMI);
	}
}
