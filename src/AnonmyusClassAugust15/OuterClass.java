package AnonmyusClassAugust15;

public class OuterClass {
    String name ="Mike";
    public void outsidemethod(){
        System.out.println("Outside Class Method");
    }
    class Inclass{
        int x=10;
        public void insidemethod(){
            System.out.println("Inner Class Method");
        }
    }
}
