package July_11;

import java.util.Scanner;

public class BreakCommandDemo {
    public static void main(String[] args) {
        //break -it will break the for loop
        // continue-- skip the current iteration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number;
        for(int i=1;i<=10;i++){
            number= sc.nextInt();
            if (number<0){
                break;
            }
        }
        System.out.println("Sorry you violated the policy");
    }
}
