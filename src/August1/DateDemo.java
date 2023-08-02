package August1;

public class DateDemo {
    private  int day;
    private int month;
    private int year;
DateDemo(){
    day=1;
    month=8;
    year=2023;
} //Default constructor
    public void printDate(){
        System.out.println("Date : "+day+"/"+month+"/"+year);
    }
}
class Test{
    public static void main(String[] args) {
        DateDemo dateDemo =new DateDemo();
        dateDemo.printDate();
    }
}