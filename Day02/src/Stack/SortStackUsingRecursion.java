package Stack;

import java.util.Stack;

public class SortStackUsingRecursion {
    // Method to pop the elements in the stack and sort them
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return stack;
        }
        int top = stack.pop();
        sortStack(stack);
        insertElements(stack, top);
        return stack;
    }

    static void insertElements(Stack<Integer> stack, Integer element) {
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
            return;
        }
        Integer top = stack.pop();
        insertElements(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(9);
        stack.push(12);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
