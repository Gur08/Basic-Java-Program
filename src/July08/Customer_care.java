package July08;

import java.util.Scanner;

public class Customer_care {
        public static void main(String[] args) {
            System.out.println("Welcome to customer service");
            System.out.println("Enter 1 for Credit card Services");
            System.out.println("Enter 2 for Debit card Services");
            System.out.println("Enter 3 for Unauthorised Transcation");
            System.out.println("Enter 4 for Speak to customer care");
            System.out.println("Enter your input");
            Scanner sc = new Scanner(System.in);

            int input = sc.nextInt();


            switch (input){
                case 1:
                    System.out.println("How I can help you with credit card services");
                    break;
                case 2:
                    System.out.println("How I can help you with debit card services");
                    break;
                case 3:
                    System.out.println("How I can help you with your transcation");
                    break;
                case 4:
                    System.out.println("We will connect you to customer care shorty");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
}
