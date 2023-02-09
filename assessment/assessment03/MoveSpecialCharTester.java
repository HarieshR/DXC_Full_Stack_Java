package assessment03;

import java.util.Scanner;

public class MoveSpecialCharTester{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String in = sc.nextLine();
		MoveSpecialChar op = new MoveSpecialChar(in);
		
		System.out.println(op.getMsc());
	}
}
