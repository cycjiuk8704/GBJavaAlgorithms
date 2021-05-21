package lesson4;

import java.util.LinkedList;

public class MyLinkedQueue<T> {
    private final LinkedList<T> queue;
    private int items;

    public MyLinkedQueue() {
        this.queue = new LinkedList<>();
        this.items = 0;
    }

    public void insert(T i) {
        queue.addLast(i);
        items++;
    }

    public T remove() {
        items--;
        return queue.pop();
    }

    public T peek() {
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public int size() {
        return items;
    }
}
