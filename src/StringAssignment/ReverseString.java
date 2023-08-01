package StringAssignment;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
//        String n ="Pragra";
//        char[] charArray = n.toCharArray();
//        for (int i = 0; i < n.length(); i++) {
//            System.out.print(charArray[i]+" ");
//        }
//        System.out.println(" ");
//        for(int j=n.length()-1;j>=0;j--){
//            System.out.print(charArray[j]+" ");
//        }
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the Word");
        String s1= sc.next();
        StringBuilder sb = new StringBuilder(s1);

        System.out.println("Revere of Pragra is - "+sb.reverse());
    }
}
