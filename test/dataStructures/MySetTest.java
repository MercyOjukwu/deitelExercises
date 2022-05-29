package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySetTest {

    MySet mySet;
    @BeforeEach public void beginEachTestWith(){
        mySet = new MySet();
    }

    @Test public void canAddToSet(){
        mySet.addElementToList("Mercy");
        assertEquals("Mercy", mySet.getElementByIndex(0));
    }

    @Test public void canAddMultipleElementsToSet(){
        mySet.addMultipleElementsToList("Mercy","Mary","Joseph");
        assertEquals("Mary", mySet.getElementByIndex(1));
    }

    @Test public void addingDuplicateElementFailsTest(){
        mySet.addMultipleElementsToList("Mercy","Mary","Mercy");
        assertEquals(2, mySet.getCount());
    }

}
