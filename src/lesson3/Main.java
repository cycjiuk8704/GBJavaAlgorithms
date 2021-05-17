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
        List<Integer> intLinkedList = new LinkedList<>(intList);
        System.out.println(intLinkedList);
        System.out.println(intLinkedList.equals(intList));
        intLinkedList.add(3, 111);
        intLinkedList.set(0, 17);
        intLinkedList.remove(1);
        System.out.println(intLinkedList);
        System.out.println((intLinkedList.get(4)) + "\n");
//3.4
        List<MyData> myDataList = new LinkedList<>();
        myDataList.add(new MyData('t'));
        myDataList.add(new MyData('g'));
        myDataList.add(new MyData('5'));
        myDataList.add(new MyData('!'));
        myDataList.add(new MyData('k'));
        myDataList.add(new MyData('1'));
//3.5
        ListIterator<MyData> listIterator = myDataList.listIterator();
        MyData m;

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
    }
}
