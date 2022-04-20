package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import chapter3.Clock;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {



    Clock rolex;
    @BeforeEach
    public void beginAllTestsWith(){
        rolex = new Clock();
    }
    @Test
    public void clock_classCanBeCreated(){
        Clock rolex = new Clock();
    }

    @Test
    public void createInstanceVariables(){
        rolex.createAttributes(0,0,0);

    }

    @Test
    public void clockCanDisplayTimeCorrectly(){
//        rolex.setTime(1,40,10);
        assertEquals("1:40:10" , Clock.displayTime());
    }




























}
