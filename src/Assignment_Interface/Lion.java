package Assignment_Interface;

public class Lion implements Animal {

    @Override
    public void feed() {
        System.out.println("Lion eat Meat");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Roaring");
    }
}
