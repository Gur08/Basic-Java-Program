package July_11.Assignment;

import java.util.Scanner;

public class Sum_N_OddNumberDoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to a calculator of addition of odd numbers");
        Scanner input=new Scanner(System.in);
        String chk ="Yes";
       do {
            System.out.println("Please enter the number upto which sum of odd number required (n)");
            int odd= input.nextInt();
            int sum = odd*odd;
            System.out.println("Sum of "+odd+" number is "+sum);
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No to exist");
            chk = input.next();
        } while (!chk.equals("No")&&!chk.equals("no"));
    }
}
