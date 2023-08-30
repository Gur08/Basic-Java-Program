package August26Java8;

import java.util.function.*;

public class LambdaInBuildFunction {
    public static void main(String[] args) {
//        Consumer<String> consumer= (s) -> System.out.println(s.toUpperCase());
//        consumer.accept("gurpreet");
        Consumer<String> consumer = (st) -> System.out.println(st.trim()); // take input return nothing
        consumer.accept(" Pragra ");
        BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> { //take 2 input return 1
            System.out.println(num1 + num2);
        };
        biConsumer.accept(25, 23);
        Predicate<Integer> predicate = (i) -> // take any value return boolean
                i % 2 == 0;
        System.out.println(predicate.test(5));
        Supplier<String> supplier = ()-> "Hello how are you"; //Take nothing give output
        String s =supplier.get();
        System.out.println(s);
        Function<String, Integer> function = (l)-> // take one input return value
            l.length();
            System.out.println(function.apply("Gur"));


    }
}
