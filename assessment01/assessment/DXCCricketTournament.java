package assessment;
import java.util.Scanner;

class DXCCricketTournament {
	public void DXCCricketTournamentDetails() {
		
//	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the total no' T-Shirts: ");
	int n = sc.nextInt();
	++n;
	String[] cart = new String[n];
    System.out.println("Enter the T-shirt type in the cart: ");
    for (int i = 0; i < n; i++) {
      cart[i] = sc.nextLine();
    }
//	String[] cart = {"round-neck", "collared", "hooded", "round-neck", "round-neck"};
	double totalCost = 0;
	int discount = 0;
	double finalAmount = 0;
	
	for (String type : cart) {
		  if (type.equals("round-neck")||type.equals("round neck")) {
		    totalCost += 200;
		  } else if (type.equals("collared")) {
		    totalCost += 250;
		  } else if (type.equals("hooded")) {
		    totalCost += 300;
		  }
		}
		--n;
		if (n < 5) {
		  discount = 0;
		} else if (n >= 5 && n <= 10) {
		  discount = 10;
		} else if (n > 10) {
		  discount = 20;
		}

		finalAmount = totalCost - ((totalCost*discount)/100) ;
		System.out.println("The final amount for the T-Shirts is: Rs." + finalAmount);
	}
	
}
	
//	  public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    String[] types = {"round-neck", "collared", "hooded"};
//	    int[] prices = {200, 250, 300};
//	    int[] cart = new int[3];
//	    int count = 0;
//	    System.out.println("Enter the no' T-Shirts: ");
//	    for (int i = 0; i < 3; i++) {
//	      System.out.print(types[i] + ": ");
//	      cart[i] = sc.nextInt();
//	     
//	    }
//	    count = cart.length;
//	    System.out.println("Count"+count);
//	    int totalCost = 0;
//	    for (int i = 0; i < 3; i++) {
//	      totalCost += cart[i] * prices[i];
//	    }
//
//	    int discount = 0;
//	    if (count<=5) 
//	        discount = 0;
//	    else if (count>5 && count <10) 
//	        discount = 10;
//	    else if (count >=10)
//	    	discount = 20;
//	    
//
//	    int finalAmount = totalCost - (totalCost * (discount / 100));
//
//	    System.out.println("Total Cost: Rs." + totalCost);
//	    System.out.println("Discount: " + discount + "%");
//	    System.out.println("Final Amount: Rs." + finalAmount);
//	  }
//	}
//
