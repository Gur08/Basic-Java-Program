package August26Java8;

import java.util.Scanner;

@FunctionalInterface
public interface Calculator {
    void arithmeticOperation();
}

@FunctionalInterface
interface Cal{
    int operation(int num1, int num2);
}
class MainCalculator{
    public static void main(String[] args) {
        Calculator calculator =() -> {
            System.out.println("Welcome to Calculator");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int x =sc.nextInt();
            System.out.println("Please enter the second number");
            int y =sc.nextInt();
            System.out.println("Please use the following :");
            System.out.println("+,-,*,/");
            String s=sc.next();
            switch (s){
                case "+":
                    System.out.println("Sum :"+(x+y));
                    break;
                case "-":
                    System.out.println("Subtract :"+ (x-y));
                    break;
                case "*":
                    System.out.println("Multiply :"+ (x*y));
                    break;
                case "/":
                    System.out.println("Multiply :"+ (x/y));
                    break;
            }
        };

         Cal sum =(num1,num2) -> {
            System.out.println("Sum :"+(num1+num2));
            return num1+num2;
        };
        Cal sub =(num1,num2) -> {
            System.out.println("Subtract :"+(num1-num2));
            return num1-num2;
        };
        Cal mult =(num1,num2) -> {
            System.out.println("Multiply :"+(num1*num2));
            return num1*num2;
        };
        Cal div =(num1,num2) -> {
            System.out.println("Div :"+(num1/num2));
            return num1/num2;
        };
        calculator.arithmeticOperation();
        sum.operation(25,54);
        sub.operation(85,45);
        mult.operation(5,5);
        div.operation(8,2);
    }
}
