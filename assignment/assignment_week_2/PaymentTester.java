package assignment_week_2;

abstract class Payment{
		
		private int customerId;
		protected String paymentId;
		protected double serviceTaxPercentage;
		
		public Payment(int customerId) {
			this.customerId = customerId;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(String paymentId) {
			this.paymentId = paymentId;
		}

		public double getServiceTaxPercentage() {
			return serviceTaxPercentage;
		}

		public void setServiceTaxPercentage(double serviceTaxPercentage) {
			this.serviceTaxPercentage = serviceTaxPercentage ;
		}
		
		public abstract double payBill(double amount);
//		{
//			return amount;
//			
//		}
		
	}

	class DebitCardPayment extends Payment{
		
		private static int counter;
		private double discountPercentage;
		
		static {
			counter = 1000;
		}
		
		public DebitCardPayment(int customerId) {
			super(customerId);
			setCustomerId(customerId);
			setPaymentId("D" + ++counter); 
		}

		public int getCounter() {
			return counter;
		}

		public void setCounter(int counter) {
			this.counter = counter;
		}

		public double getDiscountPercentage() {
			return discountPercentage;
		}

		public void setDiscountPercentage(double discountPercentage) {
			this.discountPercentage = discountPercentage;
		}
		
		public double payBill(double amount){
			
			double serviceTaxAmount = 0;
			double discountAmount = 0;
			
			if(amount <= 500) {
//				setServiceTaxPercentage(amount * .025 - getDiscountPercentage());
//				setDiscountPercentage(amount * .01);
				serviceTaxPercentage = 2.5;
				discountPercentage = 1;	
			}
			else if(amount > 500 && amount <= 1000) {
//				setDiscountPercentage(amount * .02);
//				setServiceTaxPercentage(amount*.04 - getDiscountPercentage());
				serviceTaxPercentage = 4;
				discountPercentage = 2;	
			}
			else if(amount > 1000) {
//				setDiscountPercentage(amount * .03);
//				setServiceTaxPercentage(amount*.05 - getDiscountPercentage());
				serviceTaxPercentage = 5;
				discountPercentage = 3;	
			}
			
			serviceTaxAmount = amount * serviceTaxPercentage/100;	
			discountAmount = amount * discountPercentage/100;
			
			return amount + serviceTaxAmount - discountAmount;
			
		}
	}
	
	class CreditCardPayment extends Payment{
		private static int counter;
		
		static {
			counter = 1000;
		}
		
		public CreditCardPayment(int customerId) {
			super(customerId);
			setCustomerId(customerId);
			setPaymentId("C" + ++counter);
		}

		public int getCounter() {
			return counter;
		}

		public void setCounter(int counter) {
			this.counter = counter;
		}
		
		public double payBill(double amount) {
			double serviceTaxAmount =0;
			if(amount <= 500) 
//				setServiceTaxPercentage(amount * .03);
				serviceTaxPercentage = 3;
			else if(amount > 500 && amount <= 1000) 
//				setServiceTaxPercentage(amount*.05);
				serviceTaxPercentage = 5;
			else if(amount > 1000) 
//				setServiceTaxPercentage(amount*.06);
				serviceTaxPercentage = 6;
			serviceTaxAmount = amount*serviceTaxPercentage/100;
			
			return amount + serviceTaxAmount;
		}		
		
	}
	
	class PaymentTester{
		public static void main(String args[]){
			
			DebitCardPayment debitCardPayment = new DebitCardPayment(101);
			double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
			System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
			System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
			System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
			System.out.println("Total bill amount: " + billAmount);
			
			CreditCardPayment creditCardPayment = new CreditCardPayment(102);
			billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
			System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
			System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
			System.out.println("Total bill amount: " + billAmount);
		}
	}
	
	
	