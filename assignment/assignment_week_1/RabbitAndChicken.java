package assignment_week_1;
import java.util.Scanner;

class cal_RnC {
	int h, l;
	int rabbits, chickens;
	
	public cal_RnC(int h, int l) {
		this.h = h;
		this.l = l;
	}

	public void RnC(int h, int l)
	{		 
		//heads:legs r 4:1  c 2:1
		//heads r:c -> 4:2 4rabbits:2chickens	
		
		if(l%2==0)
		{
		    for (chickens = 0; chickens <= h; chickens++) {
		        rabbits = h - chickens;
		        if (chickens * 2 + rabbits * 4 == l) {
		          break;
		        }
		      }System.out.println("Rabbits: "+rabbits+"\nChickens: "+chickens);
		}
		else
			System.out.println("The no of rabbits and chickens cant be found");
	}
}
public class RabbitAndChicken {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no' Heads: ");
		int h = sc.nextInt();
		System.out.println("Enter the no' Legs: ");
		int l = sc.nextInt();
		cal_RnC n = new cal_RnC(h,l);
		n.RnC(h,l);
	}
}
