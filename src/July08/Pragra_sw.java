package July08;

import java.util.Scanner;

public class Pragra_sw {
    public static void main(String[] args) {
        System.out.println("Welcome to Tourist service");
      System.out.println("Enter Pragra for address of pragra");
      System.out.println("Enter CN for address of CN Tower");
       System.out.println("Enter Aquarium for Address of Aquarium");
      Scanner sc = new Scanner(System.in);

       String input = sc.next();


      switch (input){
            case "Pragra" :
                System.out.println("110 Matheson Blvd W #160 Mississauga,ON L5R 4G7");
                break;
            case "CN" :
                System.out.println("How I can help you with debit card services");
                break;
            case "Aquarium" :
                System.out.println("How I can help you with your transaction");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
