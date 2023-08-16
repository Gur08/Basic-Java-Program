package August12;

public class SmartPhone extends Phone{
    @Override
    public void calling() {
        System.out.println("Video Calling can be done");
    }

    @Override
    public void dialpaid() {
        System.out.println("Touch Dial pad");
    }

    @Override
    public void network() {
        System.out.println("5G network available");
    }
}
