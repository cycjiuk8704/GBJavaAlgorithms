package lesson4;

import java.util.ArrayList;

public class MyDequeue<T> {
    private final ArrayList<T> dequeue;
    private final int front;
    private int items;

    public MyDequeue() {
        this.dequeue = new ArrayList<>();
        this.front = 0;
        this.items = 0;
    }

    public void pushFront(T i) {
        dequeue.add(front, i);
        items++;
    }

    public void pushBack(T i) {
        dequeue.add(items++, i);
    }

    public T popFront() {
        T temp = dequeue.get(front);
        dequeue.remove(front);
        items--;
        return temp;
    }

    public T popBack() {
        T temp = dequeue.get(items - 1);
        dequeue.remove(items - 1);
        items--;
        return temp;
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public void clear() {
        dequeue.removeAll(dequeue);
    }

    public int size() {
        return dequeue.size();
    }
}
