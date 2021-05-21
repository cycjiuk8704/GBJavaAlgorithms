package lesson4;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//4.1
        long startTime = System.nanoTime();
        MyStack<MyData> stackObj = new MyStack<>();
        stackObj.push(new MyData(1, 2));
        stackObj.push(new MyData(5, 12));
        stackObj.push(new MyData(21, 5));
        stackObj.push(new MyData(34, 52));
        stackObj.push(new MyData(8, 9));
        stackObj.push(new MyData(11, 12));
        stackObj.push(new MyData(41, 21));

        stackObj.peek().printToConsole();

        System.out.println("размер стека: " + stackObj.size());

        while (!stackObj.isEmpty()) {
            stackObj.pop().printToConsole();
        }

        System.out.println("размер стека: " + stackObj.size());

        System.out.println("Время выполнения методов стека: " + (System.nanoTime() - startTime));
//4.2
        startTime = System.nanoTime();
        MyQueue<MyData> queueObj = new MyQueue<>();
        queueObj.insert(new MyData(1, 2));
        queueObj.insert(new MyData(5, 12));
        queueObj.insert(new MyData(21, 5));
        queueObj.insert(new MyData(34, 52));
        queueObj.insert(new MyData(8, 9));
        queueObj.insert(new MyData(11, 12));
        queueObj.insert(new MyData(41, 21));

        queueObj.peek().printToConsole();

        System.out.println("размер очереди: " + queueObj.size());

        while (!queueObj.isEmpty()) {
            queueObj.remove().printToConsole();
        }

        System.out.println("размер очереди: " + queueObj.size());

        System.out.println("Время выполнения методов очереди: " + (System.nanoTime() - startTime));
//4.3
        startTime = System.nanoTime();
        MyDequeue<MyData> dequeueObj = new MyDequeue<>();
        dequeueObj.pushFront(new MyData(21, 5));
        dequeueObj.pushFront(new MyData(5, 12));
        dequeueObj.pushFront(new MyData(1, 2));
        dequeueObj.pushBack(new MyData(34, 52));
        dequeueObj.pushBack(new MyData(8, 9));
        dequeueObj.pushBack(new MyData(11, 12));
        dequeueObj.pushBack(new MyData(41, 21));

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        while (!dequeueObj.isEmpty()) {
            dequeueObj.popBack().printToConsole();
        }

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        dequeueObj.pushFront(new MyData(21, 5));
        dequeueObj.pushFront(new MyData(5, 12));
        dequeueObj.pushFront(new MyData(1, 2));
        dequeueObj.pushBack(new MyData(34, 52));
        dequeueObj.pushBack(new MyData(8, 9));
        dequeueObj.pushBack(new MyData(11, 12));
        dequeueObj.pushBack(new MyData(41, 21));

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        while (!dequeueObj.isEmpty()) {
            dequeueObj.popFront().printToConsole();
        }

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        dequeueObj.pushFront(new MyData(21, 5));
        dequeueObj.pushFront(new MyData(5, 12));
        dequeueObj.pushFront(new MyData(1, 2));
        dequeueObj.pushBack(new MyData(34, 52));
        dequeueObj.pushBack(new MyData(8, 9));
        dequeueObj.pushBack(new MyData(11, 12));
        dequeueObj.pushBack(new MyData(41, 21));

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        dequeueObj.clear();

        System.out.println("размер очереди dequeue: " + dequeueObj.size());

        System.out.println("Время выполнения методов очереди dequeue: " + (System.nanoTime() - startTime));
//4.4
        startTime = System.nanoTime();
        MyPriorQueue<Integer> priorQueueObj = new MyPriorQueue<>(Comparator.comparingInt(o -> o));
        priorQueueObj.add(5);
        priorQueueObj.add(2);
        priorQueueObj.add(23);
        priorQueueObj.add(52);
        priorQueueObj.add(54);
        priorQueueObj.add(12);
        priorQueueObj.add(21);

        System.out.println("размер приоритетной очереди: " + priorQueueObj.size());

        System.out.println("Текущее значение" + (priorQueueObj.peek()));

        while (!priorQueueObj.isEmpty()) {
            System.out.println(priorQueueObj.poll());
        }

        System.out.println("размер приоритетной очереди: " + priorQueueObj.size());

        System.out.println("Время выполнения методов приоритетной очереди: " + (System.nanoTime() - startTime));
//4.5
        startTime = System.nanoTime();
        MyLinkedStack<MyData> linkedStackObj = new MyLinkedStack<>();
        linkedStackObj.push(new MyData(1, 2));
        linkedStackObj.push(new MyData(5, 12));
        linkedStackObj.push(new MyData(21, 5));
        linkedStackObj.push(new MyData(34, 52));
        linkedStackObj.push(new MyData(8, 9));
        linkedStackObj.push(new MyData(11, 12));
        linkedStackObj.push(new MyData(41, 21));

        linkedStackObj.peek().printToConsole();

        System.out.println("размер стека на основе связного списка: " + linkedStackObj.size());

        while (!linkedStackObj.isEmpty()) {
            linkedStackObj.pop().printToConsole();
        }

        System.out.println("размер стека на основе связного списка: " + linkedStackObj.size());

        System.out.println("Время выполнения методов стека на основе связного списка: " + (System.nanoTime() - startTime));


        startTime = System.nanoTime();
        MyLinkedQueue<MyData> LinkedQueueObj = new MyLinkedQueue<>();
        LinkedQueueObj.insert(new MyData(1, 2));
        LinkedQueueObj.insert(new MyData(5, 12));
        LinkedQueueObj.insert(new MyData(21, 5));
        LinkedQueueObj.insert(new MyData(34, 52));
        LinkedQueueObj.insert(new MyData(8, 9));
        LinkedQueueObj.insert(new MyData(11, 12));
        LinkedQueueObj.insert(new MyData(41, 21));

        LinkedQueueObj.peek().printToConsole();

        System.out.println("размер очереди на основе связного списка: " + LinkedQueueObj.size());

        while (!LinkedQueueObj.isEmpty()) {
            LinkedQueueObj.remove().printToConsole();
        }

        System.out.println("размер очереди на основе связного списка: " + LinkedQueueObj.size());

        System.out.println("Время выполнения методов очереди на основе связного списка: " + (System.nanoTime() - startTime));


    }
}
