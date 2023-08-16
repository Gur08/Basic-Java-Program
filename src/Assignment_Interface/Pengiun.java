package Assignment_Interface;

public class Pengiun implements Animal,Swimmable{
    @Override
    public void feed() {
        System.out.println("Penguin eat fishes");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make Honking Sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can Swim");
    }
}
