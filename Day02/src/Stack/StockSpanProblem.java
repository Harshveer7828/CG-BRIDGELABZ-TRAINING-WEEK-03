package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    // Method to calculate the span array using a stack
    static int[] stockSpanner(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>(); // Stack stores indices

        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index into stack
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {7, 2, 1, 3, 3, 1, 8};
        System.out.println(Arrays.toString(stockSpanner(prices)));
    }
}
