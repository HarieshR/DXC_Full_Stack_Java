package assignment_week_1;
import java.util.Scanner;
public class palindrome {

	public static void reverseNumber(int n) {
		int org=n;
	    int r = 0;
	    while (n != 0) {
	        r = r * 10 + n % 10;
	        n /= 10;
	    }
	    Palin(r, org);
	}
	public static void Palin(int r, int o) {
	        if(r == o)
	        	System.out.println("The given num is palindrome num");  
	        else
	        	System.out.println("The given num is not a palindrome");
	    
	        
	}
	
	public static void main(String[] args) {		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	reverseNumber(num);
	}
}