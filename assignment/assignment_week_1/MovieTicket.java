package assignment_week_1;
import java.util.*;

class Movie {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;
   
    public Movie(int movieId,int noOfSeats) 
      {
        this.movieId=movieId;
        this.noOfSeats=noOfSeats;
	  }
   
    public int getMovieId()
      {
        return movieId;
      }
    public void setMovieId(int movieId)
      {
        this.movieId=movieId;
      }
    public int getNoOfSeats()
      {
	    return noOfSeats;
	  }
	public void setNoOfSeats(int noOfSeats)
	  {
	    this.noOfSeats=noOfSeats;
	  }
	public double getCostPerTicket()
	  {
	    return costPerTicket;
	  }
	public void setCostPerTicket(double costPerTicket) 
	  {
	    this.costPerTicket=costPerTicket;
	  }  
	
public double calculateTotalAmount(){
if(movieId==111) 
{
	double a;
	a=7*noOfSeats;
	a+=((2*a)/100);
	return Math.round(a);
}
else if(movieId==112)
{
	double b;
	b=8*noOfSeats;
	b+=((2*b)/100);
	return Math.round(b);
}
else if(movieId==113)
{
	double c;
	c=8.5*noOfSeats;
	c+=((2*c)/100);
	return Math.round(c);
}
else 
{
	return 0;
}
}
}
public class MovieTicket {
    public static void main(String[] args) {
    	
    	System.out.println("Enter Movie Id");
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
     	System.out.println("Enter number of seats");
     	int s = sc.nextInt();
    	
        Movie movieTicket = new Movie(id, s);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Enter valid Movie Id and number of seats");
        else
        	 System.out.println("Total amount for booking : $" +amount);
    }
}
