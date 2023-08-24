package ExceptionAugust19;

import java.util.Scanner;

public enum Enum_ {
    CREDITCARD,
    MASTERCARD,
    PAYPAL,
    DEBITCARD,;

    public static void payment(){
        System.out.println("Please select the payment method from the following");
        System.out.println(Enum_.CREDITCARD+" "+Enum_.DEBITCARD+" "+Enum_.MASTERCARD+" "+Enum_.PAYPAL);
    }

}
// everything declare here is constant
// similar to class
//Example of bank is done
// we can give value to Enum
class BankMainTest {
    public static void main(String[] args) {
       Enum_.payment();
       OnlinePayment.payment();
       Enum_ enum_=null;
       switch (enum_){
           case PAYPAL: System.out.println("Please enter Credit Details");
           break;
           case DEBITCARD: System.out.println("Please enter Debit Details");
               break;
           case CREDITCARD:
               System.out.println("Please enter Mastercard Details");
               break;
           case MASTERCARD:
               System.out.println("Please enter Paypal Details");
               break;
       }
    }

}
class OnlinePayment {
    public static void payment() {
        System.out.println("Please enter Credit Details");
        System.out.println("Please enter Debit Details");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please Enter the Method");
//        String s = sc.next();
//        Enum_[] arr = Enum_.values();
//
//        for (Enum_ n: arr) {
//            switch (n){
//                case CREDITCARD :
//                    System.out.println("Enter Creditcard Details");
//                    break;
//                case DEBITCARD :
//                        System.out.println("Enter Debitcard Details");
//                break;
//                case MASTERCARD :
//                    System.out.println("Enter Mastercard Details");
//                    break;
//            case PAYPAL :
//                    System.out.println("Enter Paypal Details");
//                break;
//            }
//        for (int i = 0; i < arr.length; i++) {
//            switch (i) {
//                case 0:
//                    System.out.println("Enter Creditcard Details");
//                    break;
//                case 1:
//                    System.out.println("Enter Debitcard Details");
//                    break;
//                case 2:
//                    System.out.println("Enter Mastercard Details");
//                    break;
//                case 3:
//                    System.out.println("Enter Paypal Details");
//                    break;
//            }
        }
    }
