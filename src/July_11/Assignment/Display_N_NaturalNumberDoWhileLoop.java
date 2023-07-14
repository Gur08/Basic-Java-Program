package July_11.Assignment;

import java.util.Scanner;

public class Display_N_NaturalNumberDoWhileLoop {
    public static void main(String[] args) {
        int input=0;
        int counter=1;
        int sum=0;
        String d ="Yes";
        System.out.println("Welcome to the world of Numbers");
       do {
           System.out.println("Please enter the number up to which you want to enter natural number and have their sum ");
           Scanner sc = new Scanner(System.in);
           input = sc.nextInt();
           do {
               System.out.println(counter);
               sum += counter;
               counter++;
           } while (input >= counter);
           System.out.println("Sum of " + input + " natural number is " + sum);
           System.out.println("Do you still want to continue");
           System.out.println("Press any key to continue and No to exist");
           d = sc.next();
           sum=0;
           counter=1;
       }while (!d.equals("No")&&!d.equals("no"));
    }
}
