package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {

    MyArrayList arr;

    @BeforeEach
    public void beginEachTestWith(){
        arr = new MyArrayList();
    }

    @Test public void canAddElementToListTest(){
       arr.addElementToList("Mercy");
       assertEquals("Mercy", arr.getElementByIndex(0));
    }

    @Test public void canAddMultipleElementsToListTest(){
        arr.addMultipleElementsToList("Mercy","Mary","Joseph","Lucy");
        assertEquals("Joseph", arr.getElementByIndex(2));
    }


    @Test public void canRemoveElementFromListTest(){
        arr.addMultipleElementsToList("Mercy","Mary","Joseph","Lucy");
        arr.removeElement(1);
        assertEquals("Lucy", arr.getElementByIndex(2));
    }


}
