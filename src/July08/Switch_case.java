package July08;

import java.util.Scanner;
// awitch case can only be use for equality input or straight forward switch
public class Switch_case {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to my House");
        System.out.println("Enter 1 for white bulb");
        System.out.println("Enter 2 for red bulb");
        System.out.println("Enter 3 for fan");
        System.out.println("Enter 4 for nothing");
        System.out.println("Enter your input");
        int input = scanner.nextInt();
        switch(input){
            case 1 :
                System.out.println("Switch on the white bulb");
                break;
            case 2:
                System.out.println("Switch on the red bulb");
                break;
                case 3:
                    System.out.println("Switch on the fan");
                    break;
            case 4:
                System.out.println("Switch on the nothing..");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
