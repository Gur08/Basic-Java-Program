package AnonmyusClassAugust15;

public class Chair implements Furniture{
    @Override
    public void sit() {
        System.out.println("You can sit on the chair");
    }

    @Override
    public void stand() {
        System.out.println("You cannot stand on the chair");
    }
}
