package July_11.Assignment;

import java.util.Scanner;

public class FiveNumberInputSumAvgWhileLoop {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String check ="Yes";
        System.out.println("Welcome to our Sum and average calculator");
        while (!check.equals("No")&&!check.equals("no")){
            System.out.println("Please enter 5 number to find their Sum and Average");
            System.out.println("Enter First Number");
            float num1=input.nextFloat();
            System.out.println("Enter Second Number");
            float num2=input.nextFloat();
            System.out.println("Enter Third Number");
            float num3=input.nextFloat();
            System.out.println("Enter Fourth Number");
            float num4=input.nextFloat();
            System.out.println("Enter Fifth Number");
            float num5=input.nextFloat();
            float sum = num1+num2+num3+num4+num5;
            System.out.println("Sum = "+sum);
            float Avg = sum/5f;
            System.out.println("Average = "+Avg);
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            check = input.next();
        }
    }
}
