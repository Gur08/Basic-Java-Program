package August22DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        List<Integer> list1 =new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list1.add(30);
        list1.add(30);
        System.out.println(Collections.min(list1));
        System.out.println(Collections.max(list1));
        System.out.println(Collections.frequency(list1,30));
    }
}
