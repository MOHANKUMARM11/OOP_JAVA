public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment SuccessfulRupees "+amount+" using UPI Payment");
    }
}
