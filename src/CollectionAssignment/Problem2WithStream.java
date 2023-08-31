package CollectionAssignment;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Problem2WithStream {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 2, 34, 66, 5, 4, 33, 45, 6, 8, 56, 76, 78, 98, 34, 37, 12, 12, 23, 43, 54, 56};
        IntStream intStream = Arrays.stream(numbers).filter(x -> x > 50);
        System.out.println("Numbers greater than 50 are :");
        intStream.forEach(System.out::println);
        OptionalInt max = Arrays.stream(numbers).max();
        System.out.println("Maximum number in the list is "+max);
        OptionalInt min = Arrays.stream(numbers).min();
        System.out.println("Minimum number in the list is "+min);
    }
}
