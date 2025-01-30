package Queue.ImplementQueueUsingStack;

import java.util.Stack;

public class MyQueue<T> {
    Stack<T> EnqueueStack;
    Stack<T> DequeueStack;

    // Constructor to initialize the enqueue and dequeue stack
    MyQueue() {
        this.EnqueueStack = new Stack<>();
        this.DequeueStack = new Stack<>();
    }

    // Method to add element in the queue
    void enqueue(T data) {
        EnqueueStack.add(data);
    }

    // Method to dequeue the
    public T dequeue() {
        if (EnqueueStack.isEmpty()) {
            System.out.println("Your Queue is empty");
        }
        while (!EnqueueStack.isEmpty()) {
            T temp = EnqueueStack.pop();
            DequeueStack.push(temp);
        }
        T temp = DequeueStack.pop();
        fillToEnqueue();

        return temp;

    }

    // Method to shift the elements in the primary queue
    private void fillToEnqueue() {
        while (!DequeueStack.isEmpty()) {
            T current = DequeueStack.pop();
            EnqueueStack.add(current);
        }
    }

    // Peek method to retrieve the top element
    public T peek() {
        if (EnqueueStack.isEmpty()) {
            throw new RuntimeException("Your queue is empty");
        }
        return EnqueueStack.peek();
    }

    // method to check is empty
    boolean isEmpty() {
        return EnqueueStack.isEmpty();
    }

    // Method to display the elements
    public void display() {
        // Transfer stack1 to stack2 to print in correct order
        if (EnqueueStack.isEmpty()) {
            System.out.println("Your queue is empty");
            return;
        }
        while (!EnqueueStack.isEmpty()) {
            T current = EnqueueStack.pop();
            System.out.print(current + " ");
            DequeueStack.add(current);
        }
        fillToEnqueue();

    }
}

