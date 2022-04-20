package Kata;

public class Stack {


    private int noOfElements;
    private int[] elements = new int[5];

    public boolean isEmpty() { if(noOfElements == 0) return true; else return false; }

    public void push(int element) { elements [noOfElements] = element; noOfElements++; }

    public int pop() { noOfElements--; return elements[noOfElements];}

    public int peek() { return elements[noOfElements - 1] ;}
}
