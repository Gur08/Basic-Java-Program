package August26Java8;

public class LambdaAsParameter {
    //Animal
    public static void main(String[] args) {
        /*Animal animal=()->{
            System.out.println("Animal is Sleeping");
        };*/
        callAnimal(()->{
            System.out.println("Animal is Sleeping");

        });
    }
    public static void callAnimal(Animal s){
        System.out.println("calling Animal");
      s.sleep();
    }
}
@FunctionalInterface
interface Animal{
    void sleep();
}