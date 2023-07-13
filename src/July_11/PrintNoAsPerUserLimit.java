package July_11;

import java.util.Scanner;

public class PrintNoAsPerUserLimit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Limit");
        int number =sc.nextInt();
        int counter=0;
        do{
            System.out.println(counter);
            counter++;
        }while(counter<=number);
    }
}
