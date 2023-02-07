package assessment02;

public class EPayWallet {
    public static void processPaymentByUser(User user, double billAmount) {
        boolean paymentSuccessful = user.makePayment(billAmount);
        if (paymentSuccessful) {
            System.out.println("Congratulations " + user.getUsername() + ", payment of " + billAmount + " was successful");
            System.out.println("Your wallet balance is " + user.getWalletBalance());
            if (user instanceof KYCUser) {
                KYCUser kycUser = (KYCUser) user;
                System.out.println("You have " + kycUser.getRewardPoints() + " reward points");
            }
        } else {
            System.out.println("Sorry " + user.getUsername() + ", not enough balance to make payment");
            System.out.println("Your wallet balance is " + user.getWalletBalance());
            if (user instanceof KYCUser) {
                KYCUser kycUser = (KYCUser) user;
                System.out.println("You have " + kycUser.getRewardPoints() + " reward points");
            }
        }
        System.out.println("--------------------------------------------");
    }
}
