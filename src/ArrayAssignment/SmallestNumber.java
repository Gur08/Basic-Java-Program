package ArrayAssignment;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to arrays");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the array length");
        int input =sc.nextInt();
        int arr[] = new int[input];
        System.out.println("Please enter the elements of array");
        for(int i=0;i<input;i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0;j<input;j++){
            for (int z=j+1;z<input;z++){
                if (arr[j]<arr[z]){
                    int temp = arr[j];
                    arr[j]=arr[z];
                    arr[z]=temp;

                }
            }
        }
        System.out.println("Descending order of array is");
        for (int c=0;c<input;c++){
            System.out.print(arr[c]+" ");
        }
        System.out.println(" ");
        System.out.println("Largest number among array is "+arr[0]);
        System.out.println("Smallest number among array is "+arr[input-1]);
    }
}
