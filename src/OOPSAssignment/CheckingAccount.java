package OOPSAssignment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckingAccount extends BankAccount{
    private float interestRate;
    private double overdraftLimits;
    private double money;

    public CheckingAccount(int accountNumber, String accountHolderName, Double balance, float interestRate, double overdraftLimits) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        this.overdraftLimits = overdraftLimits;
    }

    public CheckingAccount(int accountNumber, double money) {
        super(accountNumber);
        this.money = money;
    }

    public CheckingAccount(String accountHolderName, Double balance, float interestRate, double money) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
        this.money = money;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public double getOverdraftLimits() {
        return overdraftLimits;
    }

    public void setOverdraftLimits(double overdraftLimits) {
        this.overdraftLimits = overdraftLimits;
    }

    public void getAccountDetails() {
        System.out.println(" Account Number : "+super.getAccountNumber()+" Account Holder Name : "+super.getAccountHolderName()
                +" Total Balance : $ "+super.getBalance()+" Interest Rate : "+interestRate+" Overdraft Limit : "+overdraftLimits);
    }
public double deposit(double money){

double newBalance=getBalance()+money;
setBalance(newBalance);
    System.out.println("New Balance is "+newBalance);
return newBalance;

}

    public double withdrawal(double money)  {
        double newBal=0;
        if (getBalance()<money){
            try {
                throw new Insufficient("Insufficient Balance in Account");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            newBal = getBalance() - money;
            setBalance(newBal);
            System.out.println("New Balance is "+newBal);
        }
        return newBal;
    }

    @Override
    public void performTransaction(double amount) {

        System.out.println("Please select the transaction you want to perform");
        System.out.println("Press 1 for Deposit\n"+"Press 2 for Withdrawal");
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        if(x==1){
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
        System.out.println("Account Number "+getAccountNumber()+" Have Balance "+getBalance());
    }

    @Override
    public void getTransactionHistory() {
        LocalDate ld =LocalDate.now();
        LocalTime lt=LocalTime.now();
    System.out.println("Amount $ "+ money +" deposited in account "+" at "+lt+" on "+ ld  );
        System.out.println("Amount $ "+ money +" withdrawal from account "+" at "+lt+" on "+ ld  );
        logTransaction();
    }
}
