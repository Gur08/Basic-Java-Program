package August08Inheritance;

public class ParameterziedConstructorWithInheritance {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple","Red","15");
        laptop.printDetails1();
    }
}
class Computer{
    private String model;
    private String color;

    public Computer(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void printDetails(){
        System.out.println("Model :"+model);
        System.out.println("Color :"+color);
    }
}
class Laptop extends Computer{
    private String screenSize;

    public Laptop(String model, String color,String screenSize) {
        super(model, color);
        this.screenSize = screenSize;
    }
    public void printDetails1(){
        super.printDetails();
        System.out.println("ScreenSize :"+screenSize);
    }
}
