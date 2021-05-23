package lesson5;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int someInt = 6;
        sumRecursion(7);
        System.out.println();

//5.4

        long startTime = System.nanoTime();
        System.out.println(calculateFactorial(someInt));
        System.out.println("Время вычисления факториала с помощью цикла " + someInt + ": " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        System.out.println(calculateFactorialRecursively(someInt));
        System.out.println("Время вычисления факториала с помощью рекурсии " + someInt + ": " + (System.nanoTime() - startTime));

        System.out.println();


        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(25);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println();
//5.6
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        startTime = System.nanoTime();
        arrCopy = sortMerge(arrCopy);
        System.out.println("Время сортировки слиянием: " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        Arrays.sort(arr);
        System.out.println("Время сортировки с помощью Arrays.sort: " + (System.nanoTime() - startTime));
        System.out.println(Arrays.toString(arr));
        System.out.println();
//5.5
        int elementToSearch = 7;
        startTime = System.nanoTime();
        System.out.println(binarySearch(arr, elementToSearch));
        System.out.println("время двоичного поиска элемента " + elementToSearch + " в массиве: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        System.out.println(binarySearchRecursively(elementToSearch, 0, arr.length - 1, arr));
        System.out.println("время двоичного рекурсивного поиска элемента " + elementToSearch + " в массиве: " + (System.nanoTime() - startTime));
    }

//5.2

    public static int sumEndlessRecursion(int n) {
        System.out.println(n);
        return sumEndlessRecursion(n + 1);
    }

    public static int sumRecursion(int n) {
        System.out.println(n);
        if (n == 100) {
            return 100;
        }
        return sumRecursion(n + 1);
    }

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int nFact = 1;
        for (int i = 1; i <= n; i++) {
            nFact = nFact * i;
        }
        return nFact;
    }

    public static int calculateFactorialRecursively(int n) {
        if (n == 0) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

    public static int binarySearchRecursively(int searchKey, int low, int high, int[] arr) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == searchKey) {
            return mid;
        } else if (arr[mid] < searchKey) {
            return binarySearchRecursively(searchKey, low + 1, high, arr);
        } else {
            return binarySearchRecursively(searchKey, low, high - 1, arr);
        }
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static int[] sortMerge(int[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int mid = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, mid)), sortMerge(Arrays.copyOfRange(arr, mid, len)));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        for (int i = 0; i < result.length; i++) {
            result[i] = a[aIndex] < b[bIndex] ? a[aIndex++] : b[bIndex++];
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, ++i, b.length - bIndex);
                break;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, ++i, a.length - aIndex);
                break;
            }
        }
        return result;
    }
}

