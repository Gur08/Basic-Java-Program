package July_11.Assignment;

import java.util.Scanner;

public class Display_N_NaturalNumberDoWhileLoop {
    public static void main(String[] args) {
        int input=0;
        int counter=1;
        int sum=0;
        System.out.println("Welcome to the world of Numbers");
        System.out.println("Please enter the number up to which you want to enter natural number and have their sum ");
        Scanner sc=new Scanner(System.in);
        input = sc.nextInt();
        do {
            System.out.println(counter);
            sum+=counter;
            counter++;
        }while(input>=counter);
        System.out.println("Sum of "+input+" natural number is "+sum);
    }
}
