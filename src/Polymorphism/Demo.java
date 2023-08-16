package Polymorphism;

public class Demo {
    public static void main(String[] args) {
        /*Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.getArea());
        Circle circle = new Circle(5);
        circle.getArea();*/ // normal inheritance

        // Super Class      // Child Class
        Shape shape = new Rectangle(5,10);
        System.out.println("Area of Rectangle : "+shape.getArea());
        // assign the object of child class to super class ref
        Shape shape1 = new Circle(5);
        System.out.println("Area of Circle : "+shape1.getArea());

        // Maintenance is very easy if we made some changes tommorrow
    }
}
class Shape{
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return height*width;
    }
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}