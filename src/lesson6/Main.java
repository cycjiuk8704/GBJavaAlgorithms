package lesson6;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(new Person("Ivan", 4, 35));
        tree.insert(new Person("Valera", 7, 45));
        tree.insert(new Person("Sergey", 11, 24));
        tree.insert(new Person("Evlampiy", 6, 72));
        tree.insert(new Person("Gennadiy", 1, 38));

        tree.max().display();
        tree.min().display();

        tree.find(6).display();

        tree.delete(4);

        System.out.println();

        tree.displayTree();

        long startTime = System.nanoTime();

        tree.insert(new Person("Mikhail", 5, 41));
        tree.find(5);
        tree.delete(5);

        System.out.println();

        System.out.println("Время выполнения базовых методов дерева: " + (System.nanoTime() - startTime));
        System.out.println();


        int arSize = 10;
        Random random = new Random();
        int[] arr = new int[arSize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(arr));
        startTime = System.nanoTime();
        HeapSort.sort(arr);
        System.out.println("Время пирамидальной сортировки: " + (System.nanoTime() - startTime));
        System.out.println(Arrays.toString(arr));

    }
}
