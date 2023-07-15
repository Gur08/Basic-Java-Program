package July15;

import java.util.Scanner;

public class MethodEx {
    public static void sum(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the First number :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the second number :");
        int num1 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("Sum of two number :"+sum);
    }
}
