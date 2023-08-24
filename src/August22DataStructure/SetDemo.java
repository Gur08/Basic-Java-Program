package August22DataStructure;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>(); // doesn't maintain the order
        set.add(10);
        set.add(12);
        set.add(10);
        set.add(13);
        set.add(15);
        set.add(458);
        System.out.println(set);
        // doesn't allow duplicate
        // doesn't maintain the order
        Set<Integer> set1 =new LinkedHashSet<>(); // maintain the order
        set1.add(10);
        set1.add(12);
        set1.add(10);
        set1.add(13);
        set1.add(15);
        set1.add(458);
        System.out.println(set1);
        Set<Integer> set2 =new TreeSet<>(); // Sorted in order
        set2.add(10);
        set2.add(548);
        set2.add(10);
        set2.add(87);
        set2.add(15);
        set2.add(41);
        System.out.println(set2);
    }
}
