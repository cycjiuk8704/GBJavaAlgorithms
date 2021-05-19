package lesson4;

import java.util.ArrayList;

public class MyStack<T> {
    private final ArrayList<T> stack;
    private int top;

    public MyStack() {
        this.stack = new ArrayList<>();
        this.top = -1;
    }

    public void push(T i) {
        this.stack.add(i);
        this.top++;
    }

    public T pop() {
        T temp = this.stack.get(this.top);
        stack.remove(top);
        top--;
        return temp;
    }

    public T peek() {
        return this.stack.get(this.top);
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

    public int size() {
        return stack.size();
    }
}
