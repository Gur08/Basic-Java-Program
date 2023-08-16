package July29;

public class Laptop {

    // Getter and Setter
    //constructor demo
    private String brandName;
    private String operatingSystem;
    private double price;


    // constructor name has same as class name
    //constructor is something which initializes the object
    public Laptop(){     // default constructor
        System.out.println("Default Constructor");
    }

    public Laptop(String brandName) {
        this.brandName = brandName;
    }
    public Laptop(String brandName,String operatingSystem){
        this.brandName = brandName;
        this.operatingSystem=operatingSystem;
    }

    public Laptop(String brandName, String operatingSystem, double price) {
        this();
        this.brandName = brandName;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }
    //    public Laptop(value){ //parametrize constructor
//
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                '}';
    }
}
class LaptopMain{
    public static void main(String[] args) {
//        System.out.println(new Laptop());
//        System.out.println(new Laptop("Mac"));
//        System.out.println(new Laptop("Mac","Window"));
        System.out.println(new Laptop("Lenovo","Window",1400.2));
    }
}
