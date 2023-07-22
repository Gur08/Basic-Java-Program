package July22;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {


    int x = 10;
    int num[] ={10,20,30,40,50,60,70};
    // data type   ref = // object
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
// define single values
        int num2[] = new int[10]; //[] - define the size of the object
        num2[0]=40;
        num2[1]=50;
        num2[2]=60;
        num2[3]=70;
        num2[4]=80;
        num2[5]=90;

        System.out.println(num2[0]);
// looped
        String num3[] = new String[10]; //[] - define the size of the object
        num3[0]="Apple";
        num3[1]="Kiwi";
        num3[2]="Orange";
        num3[3]="Banana";
        num3[4]="Mango";
        num3[5]="Pineapple";

        System.out.println(num3[0]);
        for (int i=0;i<5;i++){
            System.out.println(num3[i]);
        }
// user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        int n= sc.nextInt();
        System.out.println(num[n]);
}

    }