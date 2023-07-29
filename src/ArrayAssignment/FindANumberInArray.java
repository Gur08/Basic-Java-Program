package ArrayAssignment;

import java.util.Scanner;

public class FindANumberInArray {
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
        System.out.println("Number to find in array");
        int z=0;
        int y = sc.nextInt();
        for (int j = 0; j < x; j++) {
            if (y == arr[j]) {
                z=1;
                break;
            }
        }
        switch (z){
            case 1:
                System.out.println("Yes "+y+"  exist in the array");
                break;
            case 0:
                System.out.println("No "+y+"  doesn't exist in the array");
                break;
        }
        }
    }
