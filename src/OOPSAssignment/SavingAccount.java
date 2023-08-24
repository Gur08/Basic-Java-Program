package OOPSAssignment;

public class SavingAccount extends BankAccount{
    private float interestRate;
    private double overdraftLimits;


    public SavingAccount(int accountNumber, String accountHolderName, Double balance,
                         float interestRate,double overdraftLimits,double savingAccountbalance) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate=interestRate;
        this.overdraftLimits=overdraftLimits;
    }


    public void getAccountDetails() {
        System.out.println(" Account Number : "+super.getAccountNumber()+" Account Holder Name : "+super.getAccountHolderName()
                +" Total Balance : $ "+super.getBalance()+" Interest Rate : "+interestRate+" Overdraft Limit : "+overdraftLimits);
    }



    @Override
    public void performTransaction(double amount) {
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("Deposit Amount : $ "+amount+" successful. Current balance: $ " + getBalance());
        }else {
            if (getBalance() >= (amount*(-1))) {
                setBalance(getBalance() - (amount*(-1)));
                System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
            } else {
                System.out.println("Insufficient funds. Withdrawal failed.");
            }
        }

    }

    @Override
    public void logTransaction() {

    }

    @Override
    public void getTransactionHistory() {

    }
}
