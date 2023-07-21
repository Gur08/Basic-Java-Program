package July15;

import java.util.Scanner;

public class MainOfClassCalculator {
    public static void main(String[] args) {
        String value = "Yes";
        while (!value.equals("No")&&!value.equals("no")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to our calculator");
            System.out.println("Please enter first number");
            float x=scanner.nextFloat();
            System.out.println("Please enter second number");
            float y=scanner.nextFloat();
            System.out.println("Please select an operator +,-,/,*,%");
            char input = scanner.next().charAt(0);
            ClassCalculator in = new ClassCalculator();
            switch (input) {
                case '+':
                    System.out.println(in.addition(x,y));
                    break;
                case '-':
                    System.out.println(in.subtraction(x,y));
                    break;
                case '*':

                    System.out.println(in.multiplication(x,y));
                    break;
                case '/':
                    System.out.println(in.divison(x,y));
                    break;
                case '%':
                    System.out.println(in.modulus(x,y));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("Do you still want to continue");
            System.out.println("Press No to exist or any key to continue");
            value = scanner.next();
        }
    }
}
