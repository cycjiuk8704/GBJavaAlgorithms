package lesson4;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPriorQueue<T> {
    private final ArrayList<T> priorQueue;
    private final int front;
    private final Comparator<T> comparator;
    private int items;

    public MyPriorQueue(final Comparator<T> comparator) {
        this.priorQueue = new ArrayList<>();
        this.comparator = comparator;
        this.front = 0;
        this.items = 0;
    }

    public void add(T i) {

        priorQueue.add(i);
        priorQueue.sort(comparator);
        items++;
    }

    public T poll() {
        T temp = priorQueue.get(front);
        priorQueue.remove(front);
        items--;
        return temp;
    }

    public T peek() {
        return priorQueue.get(front);
    }

    public boolean isEmpty() {
        return (items == 0);
    }

    public int size() {
        return items;
    }
}
