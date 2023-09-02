package Java8Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Pragra", "", "Software", "", "Java","Spring","","Shell");
        long count = strList.stream().filter(x -> x.isEmpty()).count();
        System.out.println("Number of empty strings are : "+count);
        List<String> collect = strList.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
        System.out.println("Strings with length greater than 4 are : "+collect);
        long count1 = strList.stream().filter(x -> x.startsWith("S")).count();
        System.out.println("Number of strings start with S are : "+count1);
        System.out.println("List before removing empty strings : \n"+strList);
        System.out.println(strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList()));

//
//        System.out.println("List After removing empty strings : "+Arrays.asList());

List<String>list= new ArrayList<>();
list.add("Coding");
list.add("Learning");
list.add("Practicing");
        System.out.println("New List : \n"+list);
        List<String> collect1 = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println("After converting to uppercase : \n"+collect1);
        list.remove("Coding");
        System.out.println(list);
    }
}
