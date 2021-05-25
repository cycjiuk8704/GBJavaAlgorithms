package lesson6;

public class Node {
    public Person person;
    public Node leftChild;
    public Node rightChild;

    public void display() {
        System.out.println("ID: " + person.id + " Name: " + person.name + " Age: " + person.age);
    }
}
