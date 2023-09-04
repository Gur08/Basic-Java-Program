package August31Streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceFunction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(32);
        list.add(26);
        list.add(87);
        list.add(7);
        list.add(87);
        list.add(58);
        list.add(21);
        Integer reduce = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum is "+reduce);
        System.out.println("List of integers is "+list);
        Integer reduce1 = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
        System.out.println("Minimum Value is "+reduce1);
        Integer reduce2 = list.stream().reduce(Integer.MAX_VALUE, (a, b) -> Integer.min(a, b));
        System.out.println("Maximum Value is "+reduce2);
    }
}
