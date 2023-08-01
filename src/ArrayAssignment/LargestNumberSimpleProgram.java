package ArrayAssignment;

import java.util.Scanner;

public class LargestNumberSimpleProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Arrays world");
        System.out.println("Please Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Please enter the elements of array");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int z =arr[0];
        for (int j=1;j<x;j++){
            if (z<arr[j]){
                z=arr[j];
            }
        }
        System.out.println("Largest Number "+z);
    }
}
