package assignment_week_1;
import java.util.*;

class msc{
	private String m;

	public msc(String m) {
		this.m = m;
	}

	public String getMsc() {
		String sc = m.replaceAll("[A-Za-z0-9]","");
		String a = m.replaceAll("[^A-Za-z0-9]","");
		return a+sc;
	}

	public void setMsc(String m) {
		this.m = m;
	}	
}

public class MoveSpecialCharacters{
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String in = sc.nextLine();
			msc op = new msc(in);
			
			System.out.println(op.getMsc());
		}
	}

