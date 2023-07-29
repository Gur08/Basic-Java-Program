package ArrayAssignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays world");
        System.out.println("Please Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int arr[] =new int[x];
        System.out.println("Please enter the elements of array");
        for (int i =0; i<x;i++){
        arr[i]= sc.nextInt();
    }
        int z=arr[0];
        int temp;
        for (int j=0;j<x;j++){
            for (int a=(j+1);a<x;a++){
            if (arr[j]>arr[a]) {
                temp =arr[j];
                arr[j]=arr[a];
                arr[a]= temp;
            }
            }
        }
        System.out.println("Ascending order is");
        for (int b=0;b<x;b++){
            System.out.print(arr[b]+" ");
        }
        System.out.println(" ");
        System.out.println("Largest number in array is "+arr[x-1]);
        System.out.println("Smallest number in array is "+arr[0]);
}
}