package StringAssignment;

import java.util.Scanner;

public class StringCharacterFind {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc =new Scanner(System.in);
        String s1 =sc.next();
        System.out.println("Enter the character to find");
        char n =sc.next().charAt(0);
        int x;
        x=s1.indexOf(n);
        if (x>=0) {
            System.out.println(n+" exist in the String ");
            System.out.println("Index of " + n + " " + x);
        }else {
            System.out.println(n+" doesn't exist in the String");
        }
    }
}
