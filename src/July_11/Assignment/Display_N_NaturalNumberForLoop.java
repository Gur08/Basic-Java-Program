package July_11.Assignment;

import java.util.Scanner;

public class Display_N_NaturalNumberForLoop {
    public static void main(String[] args) {
        int input=0;
        int sum=0;
        System.out.println("Welcome to the world of Numbers");
        for (String d="Yes";(!d.equals("no")&&!d.equals("No"));) {
            System.out.println("Please enter the number up to which you want to enter natural number and have their sum ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            for (int counter = 1; input >= counter; counter++) {
                System.out.println(counter);
                sum += counter;
            }
            System.out.println("Sum of " + input + " natural number is " + sum);
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            d = sc.next();
            sum=0;
        }
    }
}
