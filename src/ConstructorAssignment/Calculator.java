package ConstructorAssignment;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    public double add(){
        return num1+num2;
    }
    public double subtract(){
        return num1-num2;
    }
    public double multiply(){
        return num1*num2;
    }
    public double division(){
        return num1/num2;
    }
    public Calculator(double num1,double num2){
        this.num1 = num1;
        this.num2 =num2;
    }
}
class CaculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s2 = "null";
        while (!s2.equals("Yes")&& !s2.equals("yes")) {
            System.out.println("Please enter the two numbers for calculation");
            Calculator cal = new Calculator(sc.nextDouble(), sc.nextDouble());
            System.out.println("Please select the operator +,-,*,/");
            String s1 = sc.next();
            switch (s1) {
                case "+":
                    System.out.println("Addition of two numbers : " + cal.add());
                    break;
                case "-":
                    System.out.println("Subtraction of two numbers : " + cal.subtract());
                    break;
                case "*":
                    System.out.println("Multiplication of two numbers : " + cal.multiply());
                    break;
                case "/":
                    System.out.println("Division of two numbers : " + cal.division());
                    break;
                default:
                    System.out.println("Please select the right operator");
            }
            System.out.println("Do you want to Exist");
            System.out.println("Press Yes to exist or any key to Continue");
            s2 =sc.next();

        }
            System.out.println("Thanks for visting");
    }
}