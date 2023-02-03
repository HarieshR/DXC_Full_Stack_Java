package assignment_week_1;
import java.util.Scanner;

public class SumOverload {
	public void sum(int n) {
	    int sum = 0;
	    while (n > 0) {
	    	sum += n % 10;
	    	n /= 10;
	    }
	    System.out.println("Sum of digits of int argument: " + sum);
	  }

	public void sum(double n) {
	    int sum = 0;
	    while (n > 0) {
	    	sum += (int)(n % 10);
	    	n /= 10;
	    }
	    System.out.println("Sum of digits of double argument: " + sum);
	  }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int i = sc.nextInt();
		System.out.println("Enter a Double type: ");
		double d = sc.nextDouble();
		SumOverload s = new SumOverload();
	    s.sum(i);
	    s.sum(d);
	  }
	}
