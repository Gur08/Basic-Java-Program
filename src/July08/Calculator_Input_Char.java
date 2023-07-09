package July08;

import java.util.Scanner;

public class Calculator_Input_Char {
    public static void main(String[] args){
        System.out.println("Welcome to my calculator");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter + for addition");
        System.out.println("Enter - for Subtraction");
        System.out.println("Enter * for Multiplication");
        System.out.println("Enter / for Division");
        System.out.println("Enter % for Modulus");
        System.out.println("Enter your input");
        char input = scanner.next().charAt(0);
        if ((input !='+')&&(input!='-')&&(input !='*')&&(input !='/')&&(input !='%')){
            System.out.println("wrong input");
        /*if(input != '+'){
            System.out.println("wrong input");
        }else if(input !='-') {
            System.out.println("wrong input");
        } else if (input !='*') {
            System.out.println("wrong input");
        } else if (input !='/') {
            System.out.println("wrong input");
        } else if (input !='%') {
            System.out.println("wrong input");

         */
        }else {

            if (input == '+') {
                System.out.println("Enter first number");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number");
                int num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum of two number " + sum);
            } else if (input == '-') {
                System.out.println("Enter first number");
                int num3 = scanner.nextInt();
                System.out.println("Enter the second number");
                int num4 = scanner.nextInt();
                int subtract = num3 - num4;
                System.out.println("Subtraction of two number " + subtract);
            } else if (input == '*') {
                System.out.println("Enter first number");
                int num5 = scanner.nextInt();
                System.out.println("Enter the second number");
                int num6 = scanner.nextInt();
                int mult = num5 * num6;
                System.out.println("Multiplication of two number " + mult);
            } else if (input == '/') {
                System.out.println("Enter first number");
                int num7 = scanner.nextInt();
                System.out.println("Enter the second number");
                int num8 = scanner.nextInt();
                int div = num7 / num8;
                System.out.println("Division of two number " + div);
            } else if (input == '%') {
                System.out.println("Enter first number");
                int num9 = scanner.nextInt();
                System.out.println("Enter the second number");
                int num10 = scanner.nextInt();
                int mod = num9 % num10;
                System.out.println("Modulus of two number " + mod);
            } else {
                System.out.println("invalid input");
            }
        }

    }
}
