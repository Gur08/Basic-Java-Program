package August26Java8;


@FunctionalInterface
public interface Car {
    void engineType();
  public default void carclassType(){
        System.out.println("You have the following option\n"+"Sedan\n"+"Hatchback\n"+"SUV\n"+"Coupe");
    }
}
class Maincar{
    public static void main(String[] args) {
        Car car =new Car() {
            @Override
            public void engineType() {
                System.out.println("Select from the following option\n"+"Electric\n"+"Diesel\n"+"Gasoline");
            }
        };
        System.out.println("");
        car.engineType();
        System.out.println("");
        car.carclassType();
    }
}