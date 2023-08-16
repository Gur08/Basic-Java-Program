package AnonmyusClassAugust15;

public class Table implements Furniture{
    @Override
    public void sit() {
        System.out.println("You can sit on the Table");
    }

    @Override
    public void stand() {
        System.out.println("You cannot stand on the Table");
    }
}
