package July08;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Welcome to my calculator");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your input");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for division");
        int input = scanner.nextInt();

        if(input ==1){
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number");
            int num2 = scanner.nextInt();
            int sum = num1+num2;
            System.out.println("Sum of two number "+ sum);
        } else if (input==2) {
            System.out.println("Enter first number");
            int num3 = scanner.nextInt();
            System.out.println("Enter the second number");
            int num4 = scanner.nextInt();
            int subtract = num3-num4;
            System.out.println("Subratction of two number "+ subtract);
        } else if (input ==3) {
            System.out.println("Enter first number");
            int num5 = scanner.nextInt();
            System.out.println("Enter the second number");
            int num6 = scanner.nextInt();
            int mult = num5*num6;
            System.out.println("Multiplication of two number "+ mult);
        }else if (input ==4){
            System.out.println("Enter first number");
            int num7 = scanner.nextInt();
            System.out.println("Enter the second number");
            int num8 = scanner.nextInt();
            int div = num7/num8;
            System.out.println("division of two number "+ div);
        }else{
            System.out.println("invalid input");
        }


    }
}
