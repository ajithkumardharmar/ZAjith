package Collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Peek top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Pop all remaining elements
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Attempt to pop from an empty stack
        try {
            stack.pop();  // This will throw EmptyStackException
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

