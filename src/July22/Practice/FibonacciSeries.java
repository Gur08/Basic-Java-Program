package July22.Practice;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Fibonacci Series");
        System.out.println("Please enter the variable to find sum of Fibonacci Series ");
        int d = input.nextInt();
        int i = 2;
        int x = 0, y = 1, z;
        if (d == 0) {
            System.out.println(x);
        } else if (d == 1) {
            System.out.println(x + " " + y);
        } else {
            for (; i <= d; i++) {
                z = x + y;
                x = y;
                y = z;
                System.out.println(0+" "+1+" "+z);
            }
        }
    }
}