package July15;

import java.util.Scanner;

public class CalculatorMethod {
    public static void caculator(){
        System.out.println("Welcome to my calculator");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your input");
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for division");
        int input = scanner.nextInt();
        System.out.println("Enter the First number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int num1 = scanner.nextInt();
        int sum = num1+num2;
        int sub = num1-num2;
        int mult = num1*num2;
        int div = num1/num2;
        if(input==1){
            System.out.println("Sum of two number :"+sum);
        } else if (input==2) {
            System.out.println("Subtraction of two number :"+sub);
        } else if (input==3) {
            System.out.println("Multiplaction of two number :"+mult);
        }else {
            System.out.println("Division of two number :"+div);
        }
    }
}
