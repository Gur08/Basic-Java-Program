package OOPSAssignment;

public final class Transaction {
    public final static double monthlyInstallments(double amount , double interestRate){
        Double installment =(amount *(interestRate/100))/12;
        return installment;
    }
}
