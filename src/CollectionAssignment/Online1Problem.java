package CollectionAssignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Online1Problem {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
list.add("Black");
        list.add("Blue");
        list.add("Red");
        list.add("Orange");
        list.add("Green");
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        list.add(0,"Pink");
        System.out.println(list);
        System.out.println(list.get(0));
        Collections.sort(list);
        System.out.println(list);
    }
}
