import java.util.*;
public class priorityqueue {
    public static void main(String[] args){
        PriorityQueue<Object> l = new PriorityQueue<>();
        l.add(5);
        l.add(3);
        l.add(4);
        l.add(1);
        l.add(2);

        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l);
    }
}
