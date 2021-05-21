package lesson4;

import java.util.LinkedList;

public class MyLinkedStack<T> {
    private final LinkedList<T> stack;
    private int top;

    public MyLinkedStack() {
        this.stack = new LinkedList<>();
        this.top = -1;
    }

    public void push(T i) {
        this.stack.addFirst(i);
        this.top++;
    }

    public T pop() {
        top--;
        return stack.pop();
    }

    public T peek() {
        return this.stack.getFirst();
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public int size() {
        return stack.size();
    }
}
