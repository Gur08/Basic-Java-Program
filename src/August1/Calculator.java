package August1;

public class Calculator {
    private float num1;
    private float num2;
    public Calculator(float num1,float num2) {
        this.num1=num1;
        this.num2=num2;
    }
    public float add(){
        return num1+num2;
    }
    public float subtract(){
        return num1-num2;
    }
    public float multiply(){
        return num1*num2;
    }
    public float div(){
        return num1/num2;
    }
}
class MainCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator(452.87f, 25.6f);
        System.out.println("Addition :"+c.add());
        System.out.println("Subtraction :"+c.subtract());
        System.out.println("Multiply :"+c.multiply());
        System.out.println("Division :"+c.div());
    }
}