package July29;

public class Car {
    private String colour="White";
    private String Brand="Audi";
    private String EngineType="Electric";
    private String Category="Sedan";

    public String setColor(String colour){
        return colour = colour;
    }
    public String getColor(){
        return colour;
    }
    public String setBrand(String Brand){
        return Brand = Brand;
    }
    public String getBrand(){
        return Brand ;
    }
    public String setEngineType(String EngineType){
        return EngineType = EngineType;
    }
    public String getEngineType(){
        return EngineType ;
    }
    public String setCategory(String Category){
        return Category= Category;
    }
    public String getCategory(){
        return Category;
    }

}
class CarMain {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.print(car.getColor());
        System.out.print(car.getBrand());
        System.out.print(car.getEngineType());
        System.out.print(car.getCategory());
        System.out.println(" ");
        System.out.print(car.setColor("Black"));
        System.out.print(car.setBrand(" "+"BMW"));
        System.out.print(car.setEngineType(" "+"Gasoline"));
        System.out.print(car.setCategory(" "+"SUV"));
    }
}