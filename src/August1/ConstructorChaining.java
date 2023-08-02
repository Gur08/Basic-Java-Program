package August1;

import org.w3c.dom.html.HTMLAppletElement;

class mobile{
    private String brand;
    private int capacity;
    private String color;

    public mobile() {
        System.out.println("Hello inside the constructor");
    }

    public mobile(String brand, int capacity) {
        this(); // refering to default constructor
        // this statement should be first statement
        this.brand = brand;
        this.capacity = capacity;
    }

    public mobile(String brand, int capacity, String color) {
        this("Blueberry");
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public void PrintData(){
        System.out.println("Mobile : "+brand+"/"+capacity+"/"+color);
    }

    public mobile(String brand) {
        this.brand = brand;
        System.out.println("Mobile :"+brand);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        mobile mb =new mobile("Apple", 16);
        mb.PrintData();

        mobile cb =new mobile("Apple", 16,"Black");
        cb.PrintData();
    }
}
