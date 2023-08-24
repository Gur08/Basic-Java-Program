package August22DataStructure;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names =new Stack();
//        List<String> names =new Stack<>();
        names.add("Gurpreet"); //added first
        names.add("Mohit");
        names.add("Karan");
        names.add("Singh");   // added last
        // push and pop
        // push ---> add element
        //pop---> remove
        // to chk element at the top peek is the command
        System.out.println(names.peek());
        names.pop();
        System.out.println(names);
        names.add("Ramgharia");
        System.out.println(names);
        names.push("Gur");
        System.out.println(names);
    }
}
