public class BankAccount {

    final private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if(balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
        System.out.println("Account number " + accountNumber +" Holder Name : " + holderName+" has been created");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        if(holderName == null) {
            throw new IllegalArgumentException("Holder name cannot be null");
        }
        this.holderName = holderName;
        System.out.println("Account number " + accountNumber +" Holder Name : " + holderName+" has been set");
    }

    public boolean withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        if(amount > balance) {
            throw new IllegalStateException("Amount cannot be greater than balance");
        }
        balance -= amount;
        System.out.println("Amount has been withdrawn from Account number " + accountNumber+" Balance: " + balance);
        return true;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
        System.out.println("Amount has been deposited from Account number " + accountNumber+"  Balance: " + balance);
        return true;
    }
}
