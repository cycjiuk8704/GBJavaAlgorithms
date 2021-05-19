package lesson4;

import java.util.ArrayList;

public class MyQueue<T> {
    private final ArrayList<T> queue;
    private final int front;
    private int items;

    public MyQueue() {
        this.queue = new ArrayList<>();
        this.front = 0;
        this.items = 0;
    }

    public void insert(T i) {
        queue.add(i);
        items++;
    }

    public T remove() {
        T temp = queue.get(front);
        queue.remove(front);
        items--;
        return temp;
    }

    public T peek() {
        return queue.get(front);
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public int size() {
        return items;
    }
}
