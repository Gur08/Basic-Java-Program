package OOPSAssignment;

public class MainClass {
    public static void main(String[] args) {
        CheckingAccount checkingAccount= new CheckingAccount(1252,"Gur",25.365,1,522);
        checkingAccount.getAccountDetails();
        checkingAccount.performTransaction(-5);
    }
}
