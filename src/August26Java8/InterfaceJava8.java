package August26Java8;

public interface InterfaceJava8 {
    void call(); // no body abstract method
    default void text(){ // here default is a keyword
        System.out.println("video calling");
    }

}
class MainMobile{
    public static void main(String[] args) {
        InterfaceJava8 a =new InterfaceJava8() {
            @Override
            public void call() {
                System.out.println("Calling......");
            }
        };
        InterfaceJava8 a1 = () -> {
            System.out.println("Calling...");
            System.out.println("Hello");
        };
        a1.call();
        a1.text();
    }
}
//functional interface ---> has only 1 abstract method (SAM)