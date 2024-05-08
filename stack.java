package task4;

import java.util.EmptyStackException;

public class stack {
	public int[] array;
	public int top;
	public int capacity;
	public stack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1; 
    }
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow. Cannot push element onto the stack.");
            return;
        }
        array[++top] = element;
        System.out.println("Element " + element + " pushed onto the stack.");
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}


