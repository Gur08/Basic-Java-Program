package August1;

public class DateTest {
    private  int day;
    private int month;
    private int year;
    DateTest(){
        day=1;
        month=8;
        year=2023;
    } // default constructor

    public DateTest(int day, int month, int year) {
        this(); // if we type this as a method then it will call class having same arguments
        this.day = day;
        this.month = month;
        this.year = year;
    }// Parameterized constructor

    public DateTest(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public void printDate(){
        System.out.println("Date : "+day+"/"+month+"/"+year);
    }
}
class MainTest{
    public static void main(String[] args) {
        DateTest dateTest1 =new DateTest();
        dateTest1.printDate();

        DateTest dateTest2 = new DateTest(10,8,2023);
        dateTest2.printDate();

        DateTest dateTest3 = new DateTest(10,8);
        dateTest3.printDate();
    }
}