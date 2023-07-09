package July08.Loops;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Customer_Chat_Box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CRA chat box");
        System.out.println("We can serve you by three different method");
        System.out.println("Press 1 for call option");
        System.out.println("Press 2 for Office visit option");
        System.out.println("Press 3 for Chat option");
        System.out.println("Please select an option");
        int input = sc.nextInt();
        while (input > 3) {
            System.out.println("Invalid Input");
            System.out.println("Please select the right option");
            int x = sc.nextInt();
            while (((x == 1) || (x == 2) || (x == 3))) {
                switch (x) {
                    case 1:
                        System.out.println("Press 1 to drop your number");
                        System.out.println("Press 2 for contact info");
                        int y = sc.nextInt();
                        switch (y) {
                            case 1:
                                System.out.println("please enter your number");
                                long z = sc.nextLong();
                                System.out.println("Thank you we will contact you shortly");
                                break;
                            case 2:
                                System.out.println("Please contact at 5148259878");
                                break;
                            default:
                                System.out.println("invalid input");
                                break;
                        }break;
                    case 2:
                        System.out.println("we have offices at following location");
                        System.out.println("Toronto");
                        System.out.println("Montreal");
                        System.out.println("Ottawa");
                        System.out.println("Vancouver");
                        System.out.println("Alberta");
                        System.out.println("Please tell me your nearest city");
                        String v=sc.next();
                        switch (v){
                            case "Toronto":
                                System.out.println("Our Toronto office is located at 290 Bremner Blvd, Toronto, ON M5V 3L9 ");
                                break;
                            case"Montreal":
                                System.out.println("Our Montreal office is located at 2000 Saint Marc, Montreal, H3H 2N9");
                                break;
                            case"Ottawa":
                                System.out.println("Our Ottawa office is located at Wellington St, Ottawa, ON K1A 0A9");
                                break;
                            case"Vancouver":
                                System.out.println("Our Vancouver office is located at 850 W Hastings St, Vancouver, BC V6C 3J1");
                                break;
                            case "Alberta":
                                System.out.println("Our Alberta office is located at 928-5075 Falconridge Blvd NE, Calgary, AB.");
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    case 3:
                        System.out.println("How may I help you");
                        System.out.println("Press 1 for Bill");
                        System.out.println("Press 2 for Plan up gradation");
                        System.out.println("Press 3 to know your Current Plan");
                        int n=sc.nextInt();
                        switch (n){
                            case 1:
                                System.out.println("Last bill was $94.50");
                                break;
                            case 2:
                                System.out.println("Recently you account have active home package");
                                System.out.println("If you want to upgrade a plan please press 1");
                                int h=sc.nextInt();
                                switch (h){
                                    case 1:
                                    System.out.println("you sale team will contact you shortly");
                                    break;
                                    default:
                                        System.out.println("Invalid Input");
                                }
                                break;
                            case 3:
                                System.out.println("Recently you account have active home package");
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
                    x = x + 3;
                input = x-input;

            }

            }

            switch (input){
                case 1:
                    System.out.println("Press 1 to drop your number");
                    System.out.println("Press 2 for contact info");
                    int a = sc.nextInt();
                    switch (a){
                        case 1:
                        System.out.println("please enter your number");
                        int b=sc.nextInt();
                        System.out.println("Thank you we will contact you shortly");
                        break;
                        case 2:
                            System.out.println("Please contact at 5148259878");
                            break;
                        default:
                            System.out.println("invalid input");
                    }
                    break;
                case 2:
                    System.out.println("we have offices at following location");
                    System.out.println("Toronto");
                    System.out.println("Montreal");
                    System.out.println("Ottawa");
                    System.out.println("Vancouver");
                    System.out.println("Alberta");
                    System.out.println("Please tell me your nearest city");
                    String v=sc.next();
                    switch (v){
                        case "Toronto":
                            System.out.println("Our Toronto office is located at 290 Bremner Blvd, Toronto, ON M5V 3L9 ");
                            break;
                        case"Montreal":
                            System.out.println("Our Montreal office is located at 2000 Saint Marc, Montreal, H3H 2N9");
                            break;
                        case"Ottawa":
                            System.out.println("Our Ottawa office is located at Wellington St, Ottawa, ON K1A 0A9");
                            break;
                        case"Vancouver":
                            System.out.println("Our Vancouver office is located at 850 W Hastings St, Vancouver, BC V6C 3J1");
                            break;
                        case "Alberta":
                            System.out.println("Our Alberta office is located at 928-5075 Falconridge Blvd NE, Calgary, AB.");
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
                    break;
                case 3:
                    System.out.println("How may I help you");
                    System.out.println("Press 1 for Bill");
                    System.out.println("Press 2 for Plan up gradation");
                    System.out.println("Press 3 to know your Current Plan");
                    int n=sc.nextInt();
                    switch (n){
                        case 1:
                            System.out.println("Last bill was $94.50");
                            break;
                        case 2:
                            System.out.println("Recently you account have active home package");
                            System.out.println("If you want to upgrade a plan please press 1");
                            int h=sc.nextInt();
                            switch (h){
                                case 1:
                                    System.out.println("you sale team will contact you shortly");
                                    break;
                                default:
                                    System.out.println("Invalid Input");
                            }
                            break;
                        case 3:
                            System.out.println("Recently you account have active home package");
                            break;
                        default:
                            System.out.println("Invalid Input");
                    }
            }
        }
    }
