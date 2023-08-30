package August26Java8;

class main{
    public static void main(String[] args) {
        CalculatorLambda cal =  ( num1,  num2)->{
            {
                System.out.println("Sum :"+(num1 + num2));
            }
        };
        Furniture furniture=  (s)->{
            {
                System.out.println("Furniture :"+s);
            }
        };
        Coffee coffee=  (a,b)->{
            {
                System.out.println("Coffee :"+a+" "+b);
            }
        };
        Nothing nothing =()->{
            System.out.println("Nothing to print");
        };

        System.out.println(cal);
        cal.calculate(25,30);
        furniture.size("Table");
        coffee.size("Medium","Double Double");
        nothing.something();

    }
}
@FunctionalInterface
public interface CalculatorLambda {
    void calculate(int num1, int num2);
}

@FunctionalInterface
interface Furniture {
    void size(String Shape);
}

@FunctionalInterface
interface Coffee {
    void size(String size,String type);
}

@FunctionalInterface
interface Nothing {
    void something( );
}

