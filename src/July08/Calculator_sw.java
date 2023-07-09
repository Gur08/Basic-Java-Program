package July08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator_sw {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Division");
        System.out.println("Enter 4 for Multiplication");
        System.out.println("Enter 5 for Modulus");
        System.out.println("Enter your input");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        if(input >5){
            System.out.println("Invalid Input");
        }else {
        System.out.println("Enter the first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 = sc.nextInt();
        switch (input) {
            case 1:
                int sum = num2 + num1;
                System.out.println("Sum of two number " + sum);
                break;
            case 2:
                int sub = num1 - num2;
                System.out.println("Subtraction of two number " + sub);
                break;
            case 3:
                int div = num1 / num2;
                System.out.println("Division of two number " + div);
                break;
            case 4:
                int mult = num1 * num2;
                System.out.println("Multiplication of two number" + mult);
                break;
            case 5:
                int mod = num1 % num2;
                System.out.println("Modulus of two number " + mod);
                break;
            default:
                System.out.println("Invalid Input");
        }
        }
    }
}
