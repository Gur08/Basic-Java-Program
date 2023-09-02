package August31Streams;

import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Integer sum = list.stream().reduce(0, (a, b) -> a + b); // it reduce the variable, 0 is the identity where it start
         System.out.println(sum);
//         list.stream().reduce()
    }
}
