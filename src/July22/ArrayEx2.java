package July22;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int y = sc.nextInt();
        String num[] = new String[y];
        System.out.println("Please Enter the Names");
        for (int i=0;i<num.length;i++){
            num[i]= sc.next();
        }
        int j=0;
        System.out.println("Entered Values are :-");
        while(j<num.length){
            System.out.println(num[j]);
            j++;
        }
    }
}
