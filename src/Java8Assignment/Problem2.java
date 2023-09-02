package Java8Assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,5,34,56,2,6, 10, 3, 4,3, 6, 7, 3, 4);
        List<Integer> collect = list.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println("Square of numbers : "+collect);
        System.out.println("Count of numbers : "+list.stream().count());
        System.out.println("Minimum number is : "+Collections.min(list));
        System.out.println("Maximum number is : "+Collections.max(list));
        System.out.println("Sum of numbers is : "+Collections.addAll(list));
//        System.out.println("Average of numbers is : "+Collections.aver(list));
        System.out.println("Average of numbers is : "+list.stream().mapToDouble(x -> x).average().getAsDouble());
    }
}