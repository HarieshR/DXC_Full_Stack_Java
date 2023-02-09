package assessment03;
import java.util.*;

public class MoveSpecialChar{
	private String m;

	public MoveSpecialChar(String m) {
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



