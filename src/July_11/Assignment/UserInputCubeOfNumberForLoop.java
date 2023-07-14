package July_11.Assignment;

import java.util.Scanner;

public class UserInputCubeOfNumberForLoop {
    public static void main(String[] args) {
        System.out.println("Welcome to our Site");
        Scanner input = new Scanner(System.in);
        for (String check ="Yes";!check.equals("no")&&!check.equals("No");){
            System.out.println("Please enter the number to find cube of it");
            float num = input.nextFloat();
            float cube = num*num*num;
            System.out.println("Cube of "+num+" is "+cube);
            System.out.println("Do you still want to continue");
            System.out.println("Press any key to continue and No for exist");
            check= input.next();
        }
    }
}
