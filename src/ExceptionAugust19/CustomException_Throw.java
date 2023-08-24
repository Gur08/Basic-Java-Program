package ExceptionAugust19;
class Bank{
    double balance;
    double deposit;
    double withdrawn;
    public double deposit(double deposit){
        balance =balance+deposit;
        return balance;
    }
    public double withdrawn(double withdrawn) throws InsufficientBalanceException {
        if (withdrawn > balance){
            throw new InsufficientBalanceException("Insufficient Balance in Account");
        }
        balance =balance-withdrawn;
        return balance;
    }
}

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String InsufficientBalanceException) {
    }
}
public class CustomException_Throw {
    public static void main(String[] args) throws InsufficientBalanceException {
        Bank bank=new Bank();
        System.out.println("Deposit amount :"+bank.deposit(1000));

        System.out.println(bank.withdrawn(2000));


    }
}
