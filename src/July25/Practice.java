package July25;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();

        // next() - it take single input or upto space
        //next line()- to take complete string
        // when nextline character use with scanner int it consume a the space
    }
}
