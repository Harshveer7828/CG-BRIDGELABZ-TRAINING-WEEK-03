import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(25);
        deque.add(30);
        deque.add(20);
        deque.add(18);
        System.out.println(deque);
        // Retrieve the last element
        int lastElement = deque.peekLast();
        System.out.println("Last Element: " + lastElement);

        // Print all elements in the deque
        for (Integer number : deque) {
            System.out.println("Number = " + number);
        }

    }
}