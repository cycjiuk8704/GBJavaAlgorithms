package lesson1;

public class Main {
    public static void main(String[] args) {

        char[] primitivesArray = new char[]{
                'a', 'b', '1', '5', 'f', 'd', 'c', '2'
        };

        String[] referenceArray = new String[]{
                "a", "b", "1", "5", "f", "d", "c", "2"
        };

        MyData[] myDataArray = new MyData[8];
        myDataArray[0] = new MyData('a');
        myDataArray[1] = new MyData('b');
        myDataArray[2] = new MyData('1');
        myDataArray[3] = new MyData('5');
        myDataArray[4] = new MyData('f');
        myDataArray[5] = new MyData('d');
        myDataArray[6] = new MyData('c');
        myDataArray[7] = new MyData('2');

        long startTime = System.nanoTime();
        for (char c : primitivesArray) {
            if (c == 'd') {
                System.out.println(System.nanoTime() - startTime);
            }
        }

        startTime = System.nanoTime();
        for (String s : referenceArray) {
            if (s.equals("d")) {
                System.out.println(System.nanoTime() - startTime);
            }
        }

        startTime = System.nanoTime();
        for (MyData myData : myDataArray) {
            if (myData.getMyCharData() == 'd') {
                System.out.println(System.nanoTime() - startTime);
            }
        }
    }

}
