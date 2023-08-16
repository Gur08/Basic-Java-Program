package Assignment_Interface;

public class Monkey implements Animal,Climbable {

    @Override
    public void feed() {
        System.out.println("Monkey love Bananas");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkey made Chatter sound");
    }

    @Override
    public void climb() {
        System.out.println("Monkey can climb on the tress");
    }
}
