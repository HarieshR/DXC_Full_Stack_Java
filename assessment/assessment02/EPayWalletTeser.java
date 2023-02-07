package assessment02;

public class EPayWalletTeser {
    public static void main(String[] args) {
        User jack = new User(101, "Jack", "jack@dxc.com", 1000.0);
        KYCUser jill = new KYCUser(201, "Jill", "jill@dxc.com", 3000.0);

        EPayWallet.processPaymentByUser(jack, 700.0);
        EPayWallet.processPaymentByUser(jill, 1500.0);
        EPayWallet.processPaymentByUser(jill, 800.0);
        EPayWallet.processPaymentByUser(jill, 1200.0);
    }
}
