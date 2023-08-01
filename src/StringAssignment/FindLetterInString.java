package StringAssignment;

import java.util.Scanner;

public class FindLetterInString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc =new Scanner(System.in);
        String s1 =sc.next();
        char[] charArray = s1.toCharArray();
        System.out.println("Enter the character to find");
        char n =sc.next().charAt(0);
        int count =0;
        int x=0;
        for (int i = 0; i < charArray.length; i++) {
            if (n==charArray[i]){
                count=1;
                x=i;
            }
        }
        switch (count){
            case 1:
                System.out.println(n+" exist in the String");
                System.out.println("Index of the character is "+x);
                break;
            case 0:
                System.out.println(n+" doesn't exist in the String");
        }

    }
}
