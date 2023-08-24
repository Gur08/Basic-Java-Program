package August08Inheritance;

public class superKeywordVehicle {
    public static void main(String[] args) {
        NewCar newCar = new NewCar();
        newCar.display();

    }
}
class NewVehicle {
    int fuelCap = 100;

    public void displayVehicle() {
        System.out.println("This is from the vehicle class");
    }
}
class  NewCar extends NewVehicle{
    int fuelCap=50;
    public void displayCar() {
        System.out.println("This is from the car class");
    }
    public void display(){
        this.displayCar();
       super.displayVehicle();
        System.out.println("Fuel capacity for the vehicle class "+super.fuelCap);
        System.out.println("Fuel capacity for the Car class "+fuelCap);
    }
}