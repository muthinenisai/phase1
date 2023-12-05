package practice_project_8;
import java.util.EmptyStackException;

class Stack {
    private static final int MAX_SIZE = 1000;
    private int top;
    private int[] stackArray;

    public Stack() {
        top = -1;
        stackArray = new int[MAX_SIZE];
    }

    // Method to push elements onto the stack
    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow - Cannot push " + value + ". Stack is full.");
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    // Method to pop elements from the stack
    public int pop() {
        if (top < 0) {
            throw new EmptyStackException();
        } else {
            int value = stackArray[top--];
            System.out.println(value + " popped from the stack.");
            return value;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top < 0);
    }

    // Method to peek the top element of the stack
    public int peek() {
        if (top < 0) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Peeking the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Trying to pop an element from an empty stack (will throw an exception)
        // stack.pop();
    }
}
