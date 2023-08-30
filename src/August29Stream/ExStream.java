package August29Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExStream {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 23, 25);
        number.stream().filter(x -> x > 10 && x < 20).forEach(x -> System.out.println(x));
        List<String> names = Arrays.asList("Peter","Mike","John","Jane","Dan","Jennifer");

        List<String> n =names.stream().filter(x -> x.startsWith("J")).filter(y -> y.length()>4).collect(Collectors.toList());
//        List<String> n =names.stream().filter(x -> x.contains("J")).collect(Collectors.toList());
        System.out.println(n);
        List<String> n1 =names.stream().filter(x -> x.length()>4).collect(Collectors.toList());
        System.out.println(n1);
        //Chaining of methods
        // distinct can be used anywhere before or after stream with not allow duplicates
    }
}
