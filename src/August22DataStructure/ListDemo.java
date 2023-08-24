package August22DataStructure;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {
    public static void main(String[] args) {
        // list - interface == array list
        //we can assign child object to parent class/interface reference
        // generics -- which restrict data structure to a type

        List list =new ArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add("Pragra");
        list.add("true");
        // As like above there is not generic so it take all the datatypes
        List<Integer> list1 =new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

// as above generic mentioned so restricted to integer type
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2,256);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int n:list1) {
            System.out.println(n);
        }

        Iterator it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // I can array list to linked list bc parents class is same
    }
}
