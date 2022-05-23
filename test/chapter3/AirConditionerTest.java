package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AirConditionerTest {
    AirConditioner airCondition;

    @BeforeEach
    public void beginEachTestWith(){
        airCondition = new AirConditioner();
    }

    @Test
    public void powerOn(){
        airCondition.powerOn();
        assertTrue(airCondition.getPower());
    }

    @Test
    public void powerOff(){
        airCondition.powerOff();
        assertFalse(airCondition.getPower());
    }

    @Test
    public void increaseTemperature(){
        airCondition.powerOn();
        airCondition.increaseTemperature(1);
        assertEquals(17, airCondition.getTemperature());
    }

   @Test
    public void decreaseTemperature(){  
       airCondition.increaseTemperature(1);
       airCondition.increaseTemperature(1);
       airCondition.decreaseTemperature(1);
        assertEquals(17, airCondition.getTemperature());
   }

   @Test
    public void increaseTemperatureBeyondThirty(){
        airCondition.increaseTemperature(15);
       assertEquals(30, airCondition.getTemperature());
   }
   
   @Test
    public void decreaseTemperatureBelowSixteen(){
        airCondition.decreaseTemperature(15);
        assertEquals(16, airCondition.getTemperature());
   }


}
