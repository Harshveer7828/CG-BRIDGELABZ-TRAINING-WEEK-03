package Queue.ImplementQueueUsingStack;

public class Main {


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.print("Your queue is:- ");
        queue.display();
        System.out.println();
        System.out.println("Top element is "+queue.peek());
        queue.dequeue();
        System.out.print("Your queue is:- ");
        queue.display();
        System.out.println();
        System.out.println(queue.isEmpty());

    }
}
