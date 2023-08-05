package August05;

public class Vehicle {
    String color;
    int speed;
    int numOfTyres;
    public void display(){
        System.out.println("Color "+color);
        System.out.println("Speed "+speed);
        System.out.println("Num Of Tyre "+numOfTyres);
    }
}
class Car extends Vehicle{
    String fuelType;
    public void display2(){
        System.out.println("Fuel Type "+fuelType);
    }
}
class VehicleMain{
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}
