package August29Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class ex {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(21,15,1,25,2,5,3,5,8,7,9,5,45,56,2,5,47,85,2,6,9,10,12);
//        nums.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
//        System.out.println(" ");
//        nums.stream().filter(x -> x%2==0).distinct().forEach(x -> System.out.println(x));
//        System.out.println(" ");
//        nums.stream().filter(x -> x%2==0).limit(5).distinct().forEach(x -> System.out.println(x));
//        System.out.println(" ");
//        nums.stream().filter(x -> x%2==0).skip(2).limit(4).distinct().forEach(x -> System.out.println(x));
//        nums.stream().filter(x -> x%2==0).distinct().sorted().forEach(x -> System.out.println(x));
        Set<Integer> in =nums.stream().filter(x -> x%2==0).collect(Collectors.toSet());
        System.out.println(in);
    }
}
