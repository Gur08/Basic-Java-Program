package July15;

import java.util.Scanner;

public class StudentClassCreated {
    Scanner input = new Scanner(System.in);
    String firstName;
    String lastName;
    char gender;
    int age;
    int id;
    Double marks;
    public String firstName(){
        System.out.println("Enter the first name");
        firstName=input.next();
        return firstName;
    }
    public String LastName(){
        System.out.println("Enter the last name");
        String lastName=input.next();
        return lastName;
    }
    public double marks(){
        System.out.println("Enter the marks obtained");
        double marks=input.nextDouble();
        return marks;
    }
    public char gender(){
        System.out.println("Enter the Gender");
        char gender=input.next().charAt(0);
        return gender;
    }
    public int age(){
        System.out.println("Enter the age");
        int age=input.nextInt();
        return age;
    }
    public int id(){
        System.out.println("Enter the id");
        int id=input.nextInt();
        return id;
    }

}
