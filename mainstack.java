package task4;

public class mainstack {
	public static void main(String[] args) {
        stack stack = new stack(5);

        stack.push(30);
        stack.push(80);
        stack.push(0);
        stack.push(50);

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
