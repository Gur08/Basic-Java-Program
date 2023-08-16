package Assignment_Interface;

public class MainClassForAssignment {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();
        System.out.println(" ");
        Monkey monkey = new Monkey();
        monkey.climb();
        monkey.feed();
        monkey.makeSound();
        System.out.println(" ");
        Pengiun pengiun = new Pengiun();
        pengiun.feed();
        pengiun.swim();
        pengiun.makeSound();
    }
}
