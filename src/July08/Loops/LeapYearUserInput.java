package July08.Loops;

import java.util.Scanner;

public class LeapYearUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Website");
        System.out.println("You can check which was or would be a Leap year");
        int i = 1;
        while (i>0) {
            System.out.println("");
            System.out.println("Please type in the year");
            int Input = sc.nextInt();
            int leap = Input % 4;
            if (leap == 0) {
                System.out.println(Input + " is a leap year");
            } else {
                System.out.println(Input + " is not a leap year");
            }
            i++;
        }
    }
}
