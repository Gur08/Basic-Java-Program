package August12;

public class Landline extends Phone {
    @Override
    public void calling() {
        System.out.println("Only audio calling is an option");
    }

    @Override
    public void dialpaid() {
        System.out.println("Physical Dialpad");
    }

    @Override
    public void network() {
        System.out.println("Wired network");
    }
}
