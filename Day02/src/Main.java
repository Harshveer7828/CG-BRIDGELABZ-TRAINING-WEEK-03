import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        System.out.println(queue);
        Deque<Integer> deq = new LinkedList<>();
        deq.offer(2);
        deq.offer(2);
        deq.offer(2);
        System.out.println(deq);
        deq.removeAll(queue);
        System.out.println(deq);
        ConcurrentLinkedDeque<Integer> cdeq = new ConcurrentLinkedDeque<>();


    }
}
