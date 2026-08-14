public class Main {
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new CreditCardPayment();

        p1.pay(10000.0);
        p2.pay(15000.0);
        p3.pay(12000.0);
    }
}
