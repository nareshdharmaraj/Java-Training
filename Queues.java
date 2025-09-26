import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Deque;

public class Queues {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(12);
        q.add(45);
        q.add(23);
        q.add(67);
        q.add(34);
        System.out.println(q);

        while (!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
        System.out.println();
        System.out.println("_________Deque_________");
        Deque<Float> dq = new ArrayDeque<>();
        dq.add(10.5f);
        dq.add(20.5f);
        dq.add(30.39f);
        dq.addFirst(78.342f);
        dq.addLast(90.33339f);
        dq.add(67.2288f);
        dq.addFirst(34.294739f);
        dq.remove();
        dq.removeFirst();
        dq.removeLast();
        for(float i: dq){
            System.out.print(i + " ");
        }



    /*
     * this is a continuous memory allocation
     * follows FIFO (first in first out) method
     * _______________________________________________________________
     * 
     * enqueue() -> add element at the end of the queue
     * dequeue() -> we can add/remove an element from the first/last of the queue
     *      .addFirst() -> add element at the beginning of the queue
     *      .addLast() -> add element at the end of the queue
     *      .removeFirst() -> remove element from the beginning of the queue
     * priorityQueue() -> it is used to store the elements based on the priority
     */
    }
}
