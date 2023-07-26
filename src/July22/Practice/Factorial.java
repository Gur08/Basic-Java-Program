package July22.Practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of numbers");
        System.out.println("Please enter the variable to find factorial ");
        int d = input.nextInt();
        int x=1;

//        int y =1;
//        while (y<=d){
//            x =y*x;
//            y++;
//        }
        for (int y =1;y<=d;y++){
            x=y*x;
        }
        System.out.println("Factorial of "+d+" : "+x);
    }
}
