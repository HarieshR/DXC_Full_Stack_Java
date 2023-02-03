package assignment_week_2;
//import java.util.Scanner;

public class PasswordValidation {

	public static boolean checkPasswordValidity(String pw) {
		boolean flag = false;
		String regex = "^(?=.*\\d)"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[!@#$%&*_])"+"(?=\\S+$).{8,20}$";
		if (pw.matches(regex)) 
			flag = true;
		return flag;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter your password: ");
//		Scanner sc = new Scanner(System.in);
//		String pw = sc.nextLine();
		String pw = "P@$sW0rd";
		String pw1 = "Password";
		if(checkPasswordValidity(pw))
			System.out.println("Valid Password");
		else System.out.println("Invalid Password");
		
		if(checkPasswordValidity(pw1))
			System.out.println("Valid Password");
		else System.out.println("Invalid Password");
		
	}

}
