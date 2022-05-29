package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    MyQueue myQueue;
    @BeforeEach public void beginEachTestWith(){
        myQueue = new MyQueue();
    }

    @Test public void queueIsEmpty(){
        assertTrue(myQueue.isEmpty());
    }

    @Test public void canPushElementsToQueueTest(){
        myQueue.push(10);
        assertFalse(myQueue.isEmpty());
        assertEquals(10, myQueue.peek());
    }

    @Test public void canPopElementsFromQueueTest(){
        myQueue.push(10);
        myQueue.push(20);
        myQueue.push(30);
        myQueue.pop();
        assertEquals(30, myQueue.peek());

    }
}
