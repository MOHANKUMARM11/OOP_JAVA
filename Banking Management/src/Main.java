import java.util.Scanner;

public class Main {

    static double first_balance=5000.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Holder name of the account:");
        String holderName=input.nextLine();

        BankAccount b1=new BankAccount(001,holderName,first_balance);

        b1.deposit(100.50);

        b1.withdraw(400);

        b1.setHolderName("Pranesh");

    }
}
