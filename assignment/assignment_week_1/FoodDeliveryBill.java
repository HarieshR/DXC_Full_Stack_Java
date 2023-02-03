/*vegetarian combo costs $12 per plate
*non-vegetarian combo costs $15 per plate.
*delivery 1st 3kms=$0, next 3kms=$1, further kms=$2
*type of food(v/n), no' plates(min 1), kms(>0), -1 if invalid 
*/

package assignment_week_1;
import java.util.*;

class calc {
	private char type;
	int noOfPlates=0, Bill1 = -1, Bill2 =-1,Bill3 =-1, totalBill=-1;
	
	calc(char type) {
		this.type = type;
	}

	public char getType() {
		return type;
	}

	public int setType(char type) {
		this.type = type;
		if(type=='v'||type=='V')
			return veg();
		else if(type=='n'||type=='N')
			return nonVeg();
		else if(type=='b'||type=='B')
			return both();
		else
		{
			System.out.println("You have selected an invalid food type");
		    return -1;
		}
	}

	int veg() {	
		System.out.println("Please enter the num of Veg plates($12 per plate)");
		Scanner sc = new Scanner(System.in);
		noOfPlates = sc.nextInt();
		Bill1 = noOfPlates * 12;	
		return Bill1;
	}
	
	int nonVeg() {
		System.out.println("Please enter the num of Non Veg plates($15 per plate)");
		Scanner sc = new Scanner(System.in);
		noOfPlates = sc.nextInt();
		Bill2 = noOfPlates * 15;
		return Bill2;
	}
	
	int both() {
		System.out.println("You have selected both Veg and Non Veg food type");
		Bill1= veg();
		Bill2= nonVeg();
		Bill3= Bill1+Bill2;
		return Bill3;
	}
	
}

public class FoodDeliveryBill {

	public static void main(String[] args) {
		char foodType, delivery;
		int Bill=-1, Kms=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Food Type(V- Veg/N- Non-veg/B- both) ");
		foodType = sc.next().charAt(0);
		calc type =new calc(foodType);
		Bill= type.setType(foodType);
//		System.out.println("Your Food bill is: "+ Bill );
		while(Bill>0)
		{
//			System.out.println("Press 'Y' for Delivery 'N' for Dine in ");
//			delivery = sc.next().charAt(0);
//	
//			if(delivery=='y'||delivery=='Y') {
				System.out.println("Please enter the num of Kms: ");
				Kms = sc.nextInt();
				if(Kms<=3)
					System.out.println("Enjoy Free Delivery, Your Total Bill is: "+Bill);
				else if(Kms>3&& Kms<=6)
					System.out.println("$1 per km above 3kms and below 6kms, Your Total Bill is: "+(Bill+Kms-3));
				else if(Kms>6)
					System.out.println("$2 per km above 6kms, Your Total Bill is: "+(Bill+((Kms-6)*2)+3));
//			}
//			else if(delivery=='n'||delivery=='N') {
//				System.out.println("Thank you for your order you can Dine in");
//			}
//			else
//				System.out.println("Please enter valid response!");
			break;
		}
	}

}
