package July_18;

import java.util.Scanner;

public class CaculateCircleArea {

    static double pi =3.14;

    public static double Circle(double r){
        double Area= pi*r*r;
        return Area;
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc=new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(Circle(r));
    }
}
