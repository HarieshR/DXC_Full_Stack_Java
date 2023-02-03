/*
Define a class named Fruit Juice with the following description: [15]
Instance variables / data members :
int product_code — stores the product code number
String flavour — stores the flavour of the juice (E.g. orange, apple, etc.)
String pack_type — stores the type of packaging (E.g. tetra-pack, PET bottle, etc.)
in pack_size — stores package size (E.g. 200 ml, 400 ml, etc.)
in product_price — stores the price of the product
Member methods :
(i) FruitJuice() — Default constructor to initialize integer data members to 0 and String data members to.
(ii) void input( ) — To input and store the product code, flavour, pack type, pack size and product price.
(iii) void discount( ) — To reduce the product price by 10.
(iv) void display() — To display the product code, flavour, pack type, pack size and product price.
*/

package assignment_week_1;
import java.util.*;

class FruitJuice {
	private int productCode;
	private String flavour;
	private String packType;
	private int packSize;
	private int productPrice;
	
	  public FruitJuice() {
	      productCode = 0;
	      flavour = "";
	      packType = "";
	      packSize = 0;
	      productPrice = 0;
	  }
	
	  public void input() {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter product code: ");
		  productCode = sc.nextInt();
		  System.out.print("Enter flavour(E.g. orange, apple, etc.): ");
		  flavour = sc.next();
		  System.out.print("Enter pack type(E.g. tetra-pack, PET bottle, etc.): ");
		  packType = sc.next();
		  System.out.print("Enter pack size in ml(E.g. 200 ml, 400 ml, etc.): ");
		  packSize = sc.nextInt();
		  System.out.print("Enter product price: ");
		  productPrice = sc.nextInt();
	  }
	
	  public void discount() {
		  productPrice -= (productPrice - 10);
	  }
	
	  public void display() {
		  System.out.println("Product Code: " + productCode);
		  System.out.println("Flavour: " + flavour);
		  System.out.println("Pack Type: " + packType);
		  System.out.println("Pack Size: " + packSize +"ml");
		  System.out.println("Product Price(10rs Discount): " + productPrice);
	  }
	  
	  public static void main(String[] args) {
	      FruitJuice f = new FruitJuice();
	      f.input();
	      f.discount();
	      f.display();
	    }
	}