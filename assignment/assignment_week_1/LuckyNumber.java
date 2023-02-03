//sum of squares of every even-positioned digit (starting from the second position) 
//is a multiple of 9. E.g. - 1623 = 62+32 = 45 is a multiple of 9 and hence is a lucky number.

package assignment_week_1;
import java.util.*;

class LN{
	private int num;
	
	public LN(int num) {
		this.num = num;
	}
	
	public boolean getLN() {
		int rev = reverse(num);
		int l= lsq(rev);
		boolean lc= lcheck(l);
		return lc;
	}
	int reverse(int n) {
	    int r = 0;
	    while (n != 0) {
	        r = r * 10 + n % 10;
	        n /= 10;
	    }
	    return r;
	}
	
	int lsq(int n) {
        int t = n,c=0,s=0,r;
        while (t != 0) {
        	c+=1;
            r = t % 10;
            if(c>1&&c%2==0)
            s += Math.pow(r, 2);
            t /= 10;
            
        }return s;
	}

    boolean lcheck(int n) {
    	if(n%9==0)
    		return true;
    	else
    		return false;
    }
        
}


public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num to check if it is lucky num: ");
		int in = sc.nextInt();
	
		LN op = new LN(in);
		if(op.getLN()) 
			System.out.println("The entered num is a lucky num");
		else
			System.out.println("The entered num is not a lucky num");
	}

}
