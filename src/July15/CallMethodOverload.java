package July15;

import java.util.Scanner;

public class CallMethodOverload {
    public static void main(String[] args) {
        System.out.println("Welcome to our calculator");
        System.out.println("Enter the Inputs as follows");
        System.out.println("Enter 2 values for addition");
        System.out.println("Enter 3 values for Multiplication");
        System.out.println("Enter 4 values for Subtraction");
        Scanner input=new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();


        System.out.println(MethodOverload.calculatoroverload(num1, num2));
        int num3= input.nextInt();
        System.out.println(MethodOverload.calculatoroverload(num1, num2, num3));
        int num4= input.nextInt();
        System.out.println(MethodOverload.calculatoroverload(num1, num2, num3, num4));
    }
}
