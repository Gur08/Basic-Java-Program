package August12;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new SmartPhone();
        phone.calling();
        phone.dialpaid();
        phone.network();
        System.out.println(" ");
        Phone phone1=new SmartPhone();
        phone1.network();
        phone1.dialpaid();
        phone1.calling();
    }
}

