package assignment_week_1;
import java.util.*;

class sr{
	
	private String s;
	
	public sr(String s) {
	this.s = s;
	}
	
	public String getSr() {
		String wsr=s.replaceAll(" ", "");
		return wsr;
	}
	
	public void setSr(String s) {
		this.s = s;
	}
}

public class WhiteSpaceRemover {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inp = sc.nextLine();
		sr op = new sr(inp);
		System.out.println(op.getSr());
	}

}
