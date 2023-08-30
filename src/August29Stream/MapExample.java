package August29Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,25,35,85,25,26,4,7,5);
        List<Integer> productOf2 =nums.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(productOf2);
        List<String> names = Arrays.asList("Peter","Mike","John","Jane","Dan","Jennifer");
        List<String> upperCase=names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);
        Stream<String> stringStream = names.stream().map(x -> x.toUpperCase());
//        IntStream intStream = names.stream().mapToInt(x -> x.toUpperCase());



//        final String z;
//        List<String> greater4=names.stream().map(y -> y.length()>4).collect(Collectors.toList());
    }
}
