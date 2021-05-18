package lesson3;

import lesson1.MyData;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] primitivesArray = {43, 3, 11, 5, 1, 2, 6, 62, 13, 21, 35, 54};

        long startTime = System.nanoTime();
//3.1
        List<Integer> intList = new ArrayList<>(Arrays.asList(primitivesArray));
        System.out.println("Время преобразования массива в список: " + (System.nanoTime() - startTime) + "\n");
//3.2
        startTime = System.nanoTime();
        intList.add(35);
        intList.set(3, 25);
        intList.remove(4);
        System.out.println(intList.get(6));
        System.out.println("Время выполнения основных методов: " + (System.nanoTime() - startTime) + "\n");
        System.out.println(intList);
//3.3
        SingleLinkedList<Integer> intLinkedList = new SingleLinkedList<>();
        for (int i = 0; i < intList.toArray().length; i++) {
            intLinkedList.insert(intList.get(i));
        }
        intLinkedList.display();
        intLinkedList.insert(111);
        intLinkedList.insert(3);
        intLinkedList.display();
        intLinkedList.delete();
        System.out.println(intLinkedList.find(6));
        intLinkedList.display();
//3.4
        DoublyLinkedList<Character> myDataList = new DoublyLinkedList<>();
        myDataList.insertForward(new MyData('t').getMyCharData());
        myDataList.insertForward(new MyData('g').getMyCharData());
        myDataList.insertForward(new MyData('5').getMyCharData());
        myDataList.insertForward(new MyData('!').getMyCharData());
        myDataList.insertLast(new MyData('k').getMyCharData());
        myDataList.insertLast(new MyData('1').getMyCharData());
        myDataList.insertForward(new MyData('2').getMyCharData());
        myDataList.insertLast(new MyData('b').getMyCharData());
        myDataList.display();
        myDataList.deleteFirst(myDataList.head);
        myDataList.display();
        myDataList.insertForward(new MyData('2').getMyCharData());
        myDataList.display();
        myDataList.deleteLast(myDataList.head);
        myDataList.display();
        System.out.println();

//3.5
        List<MyData> myDataLinkedList = new LinkedList<>();
        myDataLinkedList.add(new MyData('t'));
        myDataLinkedList.add(new MyData('g'));
        myDataLinkedList.add(new MyData('5'));
        myDataLinkedList.add(new MyData('!'));
        myDataLinkedList.add(new MyData('k'));
        myDataLinkedList.add(new MyData('1'));
        myDataLinkedList.add(new MyData('2'));
        myDataLinkedList.add(new MyData('b'));
        ListIterator<MyData> listIterator = myDataLinkedList.listIterator();
        MyData m;
        startTime = System.nanoTime();
        while (listIterator.hasNext()) {
            m = listIterator.next();
            m.printToConsoleMyCharData();

        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            m = listIterator.previous();
            m.printToConsoleMyCharData();
        }
        System.out.println();
        System.out.println("Время выполнения основных методов: " + (System.nanoTime() - startTime) + "\n");
    }
}

class Link<T> {
    private final T link;
    private Link<T> next;

    public Link(T link) {
        this.link = link;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public T getValue() {
        return link;
    }
}

class SingleLinkedList<T> {
    private Link<T> first;

    public SingleLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(T link) {
        Link<T> l = new Link<>(link);
        l.setNext(first);
        this.first = l;
    }

    public Link<T> delete() {
        Link<T> temp = first;
        first = first.getNext();
        return temp;
    }

    public void display() {
        Link<T> current = first;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public T find(T searchNode) {
        Link<T> findNode = new Link<>(searchNode);
        Link<T> current = first;
        while (current != null) {
            if (current.getValue().equals(findNode.getValue())) {
                return findNode.getValue();
            }
            current = current.getNext();
        }
        return null;
    }
}

class Node<T> {

    public final T data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getValue() {
        return data;
    }
}

class DoublyLinkedList<T> {
    Node<T> head;

    public void insertForward(T data) {
        Node<T> elementToInsert = new Node<>(data);
        elementToInsert.next = head;
        elementToInsert.previous = null;
        if (head != null) {
            head.previous = elementToInsert;
        }
        head = elementToInsert;
    }

    public void insertLast(T data) {
        Node<T> elementToInsert = new Node<>(data);
        Node<T> last = head;
        elementToInsert.next = null;

        if (head == null) {
            elementToInsert.previous = null;
            head = elementToInsert;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = elementToInsert;
        elementToInsert.previous = last;
    }

    public void deleteFirst(Node<T> elementToBeDeleted) {
        if (head == null || elementToBeDeleted == null) {
            return;
        }
        head = elementToBeDeleted.next;
    }

    public void deleteLast(Node<T> elementToBeDeleted) {
        if (head == null || elementToBeDeleted == null) {
            return;
        }
        Node<T> last = head;
        while (last.next != null) {
            last = last.next;
        }

        last = last.previous;
        last.next = null;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


