package assignment_week_2;

class InvalidCouponCodeExeption extends Exeption{
	InvalidCouponCodeExeption(String message){
		
	}
}

class InvalidDestinationDExeption{
	InvalidDestinationExeption(String message){
		
	}
}

class InvalidTripPackageExeption{
	InvalidTripPackageExeption(String message){
		
	}
}

class BusBooking{
	private int bookingId;
	private String destination, tripPackage;
	private double totalAmount;
	
	public BusBooking(int bookingId, String destination, String tripPackage) {
		super();
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
		this.totalAmount = 0;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTripPackage() {
		return tripPackage;
	}

	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public String bookTrip(String couponCode,int numberOfMembers) {
		
	}
	public boolean validateCouponCode(String couponCode,int numberOfMembers) {
		
	}
}
	class JumboBusService{
		public static void main(String[] args) {
			BusBooking booking = new BusBooking(101,"Orlando", "Regular");
			String result = booking.bookTrip("BIGBUS", 11);
			
			if(result.equals("Booking successful")){
				System.out.println(result);
				System.out.println("Total amount for the trip: " + booking.getTotalAmount());
			}
			else{
				System.out.println(result);
				System.out.println("Your booking was not successful, please try again!");
			}
		}
	} 	