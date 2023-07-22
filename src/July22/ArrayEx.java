package July22;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the size of Array");
        int y = sc.nextInt();
        int num[] = new int[y];
        System.out.println("Please Enter the Array Values");
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        int j=0;
        System.out.println("Entered Values are :-");
        while(j<num.length){
            System.out.println(num[j]);
            j++;
        }
    }
}
