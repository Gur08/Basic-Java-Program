package OOPSAssignment;

public class MainBank {
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(548792, "Gurpreet", 2500.54, 5, 50.21);
        ca.deposit(250.25);
        ca.performTransaction(500);
        ca.getAccountDetails();
        ca.getInterestRate();
        ca.getTransactionHistory();

        SavingAccount sa = new SavingAccount(87594, "Singh", 54.25, 3, 254.54, 578.98);
        sa.deposit(250.25);
        sa.performTransaction(500);
        sa.getAccountDetails();
        sa.getInterestRate();
        sa.getTransactionHistory();


    }

}
