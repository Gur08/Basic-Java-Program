package ExceptionAugust19;

import java.util.Scanner;

class DriverRules {
    int age;
    String name;

    public String voting() throws AgeException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the age");
        age= sc.nextInt();
        System.out.println("Please enter the name");
        name=sc.next();
        if (age < 18) {
            throw new AgeException(name+" cannot vote "+"For Voting minimum age required is 18");
        } else
            return name+" can Vote";
    }
}
class AgeException extends Exception {
    public AgeException(String AgeLimitException) {
        super(AgeLimitException);
    }
}
public class Practice_Throw_Exception {
    public static void main(String[] args) throws AgeException {

        DriverRules dr = new DriverRules();
        System.out.println(dr.voting());
    }
}
