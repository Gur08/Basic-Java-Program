package August22DataStructure;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(12);
        queue.offer(14);
        queue.offer(57);// to add an element
        queue.offer(58);
        System.out.println(queue);
        queue.poll();// to remove a element
        System.out.println(queue);
        System.out.println(queue.peek());// next element in a line
    }
}


