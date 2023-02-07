package assessment02;

class KYCUser extends User {
    private int rewardPoints;

    public KYCUser(int id, String username, String email, double walletBalance) {
        super(id, username, email, walletBalance);
        rewardPoints = 0;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
    public boolean makePayment(double billAmount) {
        boolean paymentSuccess = super.makePayment(billAmount);
        if (paymentSuccess) {
            rewardPoints += (int) (0.1 * billAmount);
        }
        return paymentSuccess;
    }
}
