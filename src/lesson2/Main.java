package lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] primitivesArray = new int[]{
                43, 3, 11, 5, 1, 2, 6, 62, 13, 21, 35, 54
        };

        long startTime = System.nanoTime();
        int[] partOneArray = Arrays.copyOf(primitivesArray, primitivesArray.length);
        System.out.println(Arrays.toString(partOneArray));
        Arrays.sort(partOneArray);
        System.out.println(Arrays.toString(partOneArray));
        System.out.println(Arrays.binarySearch(partOneArray, 21));
        Arrays.fill(partOneArray, 1);
        System.out.println(Arrays.toString(partOneArray));
        System.out.println((System.nanoTime() - startTime) + "\n");

        int[] partTwoArray = Arrays.copyOf(primitivesArray, primitivesArray.length);
        Arrays.sort(partTwoArray);
        System.out.println(Arrays.toString(partTwoArray));
        startTime = System.nanoTime();
        System.out.println("результат линейного поиска: " + linearSearch(partTwoArray, 21));
        System.out.println("время выполнения: " + (System.nanoTime() - startTime) + "\n");

        startTime = System.nanoTime();
        System.out.println("результат бинарного поиска: " + binarySearch(partTwoArray, 21));
        System.out.println("время выполнения: " + (System.nanoTime() - startTime) + "\n");

        int[] partThreeArray = new int[400];
        Random random = new Random();
        for (int i = 0; i < partThreeArray.length; i++) {
            partThreeArray[i] = random.nextInt(600);
        }
        int[] partThreeArrayCopy = Arrays.copyOf(partThreeArray, partThreeArray.length);
        startTime = System.nanoTime();
        Arrays.sort(partThreeArrayCopy);
        System.out.println("время выполнения сортировки с помощью Arrays.sort: " + (System.nanoTime() - startTime));

        int[] partFourArray = Arrays.copyOf(partThreeArray, partThreeArray.length);
        startTime = System.nanoTime();
        bubbleSortArray(partFourArray);
        System.out.println("время выполнения сортировки пузырьковым методом: " + (System.nanoTime() - startTime));

        int[] partFiveArray = Arrays.copyOf(partThreeArray, partThreeArray.length);
        startTime = System.nanoTime();
        choiceSortArray(partFiveArray);
        System.out.println("время выполнения сортировки методом выбора: " + (System.nanoTime() - startTime));

        int[] partSixArray = Arrays.copyOf(partThreeArray, partThreeArray.length);
        startTime = System.nanoTime();
        insertionSortArray(partSixArray);
        System.out.println("время выполнения сортировки методом вставки: " + (System.nanoTime() - startTime));
    }

    public static int linearSearch(int[] partTwoArray, int elementToSearch) {
        for (int i = 0; i < partTwoArray.length; i++) {
            if (partTwoArray[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] partTwoArray, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = partTwoArray.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (partTwoArray[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (partTwoArray[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (partTwoArray[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void bubbleSortArray(int[] array) {
        boolean sorted = false;
        int buff;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }
    }

    public static void choiceSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            swapArrayElements(array, i, min);
        }
    }

    public static void insertionSortArray(int[] array) {
        int in;
        int buff;
        for (int i = 1; i < array.length; i++) {
            buff = array[i];
            in = i;
            while (in > 0 && array[in - 1] >= buff) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = buff;
        }
    }

    public static void swapArrayElements(int[] array, int elementOne, int elementTwo) {
        int buff = array[elementOne];
        array[elementOne] = array[elementTwo];
        array[elementTwo] = buff;
    }
}
