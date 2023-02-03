package assignment_week_2;

public class Bill {
	private static int counter;
	private String BillId, paymentMode;
	
	static {
		counter = 9000;
	}
	
	public Bill(String paymentMode) {
		this.BillId = "B"+ ++counter;
		this.paymentMode = paymentMode;
	}

	public static int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getBillId() {
		return BillId;
	}

	public void setBillId(String BillId) {
		this.BillId = BillId;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}





	public static void main(String[] args) {
		Bill Bill1 = new Bill("DebitCard");
		Bill Bill2 = new Bill("PayPal");
		Bill Bill3 = new Bill("UPI");
		Bill Bill4 = new Bill("NetBanking");
		
		Bill[] Bills = { Bill1, Bill2,Bill3,Bill4 };
		for (Bill Bill : Bills) {
		System.out.println("Bill Details");
		System.out.println("Bill Id: " + Bill.getBillId());
		System.out.println("Payment method: " + Bill.getPaymentMode());
		System.out.println();
		}
	}
}
