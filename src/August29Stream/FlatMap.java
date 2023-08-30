package August29Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<String> names1 = Arrays.asList("Peter","Eva","Mike");
        List<String> names2 = Arrays.asList("Gur","Karan","Mohit");
        List<String> names3 = Arrays.asList("James","Jack","Gurvinder");
        List<List<String>> allNames =Arrays.asList(names1,names2,names3);
        System.out.println(allNames);

       List<String> collect = allNames.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(collect);
        List<String> newList =allNames.stream().flatMap(x ->x.stream()).map(y ->y.toUpperCase()).collect(Collectors.toList());
        System.out.println(newList);
    }
}
