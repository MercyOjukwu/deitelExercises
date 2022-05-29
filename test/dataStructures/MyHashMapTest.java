package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyHashMapTest {

    MyHashMap map;
    @BeforeEach public void beginEachTestWith(){
        map = new MyHashMap();
    }

    @Test public void mapIsEmptyTest(){
        assertTrue(map.isEmpty());
    }

    @Test public void canAddToMap(){
        map.addMultipleElementsToList("Orange", "Banana","Mango");
        assertEquals(3, map.getCount());
    }

    @Test public void canOnlyAddDistinctElementsToMapTest(){
        map.addMultipleElementsToList("Orange", "Banana","Mango","Orange");
        assertEquals(3, map.getCount());
    }
}
