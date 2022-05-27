package chapter8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test public void classCanBeCreated(){
        Diary diary = new Diary();
        diary.createEntry();
        assertEquals(" ", diary.findEntry());
    }
}
