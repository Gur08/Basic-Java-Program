package August29Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for (Integer newList: list){
            if (newList % 2==0){
                System.out.println(" "+newList);
            }
        }
        list.stream().filter(x -> x%2==0).forEach(System.out::println); //Method Reference intro--> If we want to call a function under a class we used thread operator (::)
        // or semi-colon opertor like here we are refering print function in system class
        // method reference --> :: --- access method inside the class
        List<Integer>oddNumber =list.stream().filter(x -> x%2 ==0).collect(Collectors.toList());
        System.out.println("\n"+oddNumber);
    }
}
