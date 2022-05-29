package dataStructures;

public class MyQueue{
    private MyStack myQueue = new MyStack();
    private int noOfElements;
    private final int[] elements = new int[5];

    public void pop(){
        --noOfElements;
    }

    public boolean isEmpty() {
        return myQueue.isEmpty();
    }

    public void push(int element){
        myQueue.push(element);
    }

    public int peek() {
        return myQueue.peek();
    }
}
