package dataStructures;

public class MyStack {

    private int noOfElements;
    private final int[] elements = new int[5];

    public boolean isEmpty() { return noOfElements == 0;}

    public void push(int element) { elements [noOfElements] = element; noOfElements++;}

    public int pop() { noOfElements--; return elements[noOfElements];}

    public int peek() { return elements[noOfElements - 1] ;}
}
