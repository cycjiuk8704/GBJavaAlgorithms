package lesson1;

public class MyData {
    private final char myCharData;

    public MyData(char myCharData) {
        this.myCharData = myCharData;
    }

    public char getMyCharData() {
        return myCharData;
    }

    public void printToConsoleMyCharData() {
        System.out.print(myCharData + ", ");
    }
}
