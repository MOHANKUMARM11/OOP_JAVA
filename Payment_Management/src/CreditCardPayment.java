public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment Successful Rupees "+amount+" using CreditCard Payment");
    }
}
