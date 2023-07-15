package July15;

import java.util.Scanner;

public class assignmentSolution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        Assignment.enterInformation(age);
        System.out.println("Enter the name");
        String name = input.next();
        Assignment.enterInformation(name);
        System.out.println("Enter the salary");
        double salary = input.nextDouble();
        Assignment.enterInformation(salary);
    }
}
