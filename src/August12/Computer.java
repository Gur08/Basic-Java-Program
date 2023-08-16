package August12;

// interface class have all the variables static and final therfore there is no constructor
public interface Computer {
    void calculate();
    void surftheInternet();

}
class Mobile implements Computer,Telephone{

    @Override
    public void calculate() {
        System.out.println("Calculating");
    }

    @Override
    public void surftheInternet() {
        System.out.println("Surf the internet");
    }

    @Override
    public void makeCalls() {
        System.out.println("Can Make calls");
    }

    @Override
    public void recieveCalls() {
        System.out.println("can recieve calls");
    }
    public void games(){

    }
}
class maintest{
    public static void main(String[] args) {
        Mobile mobile =new Mobile();
        mobile.calculate();
        mobile.makeCalls();
        mobile.surftheInternet();
        mobile.recieveCalls();
    }
}