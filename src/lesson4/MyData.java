package lesson4;

public class MyData {
    private final int x;
    private final int y;

    public MyData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printToConsole() {
        System.out.println("X: " + this.x + " Y: " + this.y);
    }
}
