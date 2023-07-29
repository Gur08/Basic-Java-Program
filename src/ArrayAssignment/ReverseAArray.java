package ArrayAssignment;

import java.util.Scanner;

public class ReverseAArray {
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
        System.out.println("Reverse of array");
        for (int j=(x-1); j>=0;j-- ){
            System.out.print(arr[j]+" ");
        }
    }
}
