package OOPSAssignment;

public abstract class BankAccount implements TransactionLog {
    private int accountNumber;
    private String accountHolderName;
    private Double balance;

    public BankAccount(int accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public abstract void performTransaction(double amount);
}