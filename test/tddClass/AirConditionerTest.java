package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AirConditionerTest {

    @Test
    public void powerOn(){

    //given
    AirConditioner airCondition = new AirConditioner();

    //when
    airCondition.powerOn(true);

    //assert
    assertEquals(true, airCondition.getPower());





}
    @Test
    public void powerOff(){

        AirConditioner airCondition = new AirConditioner();
        airCondition.powerOff(false);
        assertEquals(false, airCondition.getPower());
    }



    @Test
    public void increaseTemperature(){
        AirConditioner airCondition = new AirConditioner();
        airCondition.increaseTemperature(28);
        assertEquals(28, airCondition.getThermostat());
    }

   @Test
    public void decreaseTemperature(){
        AirConditioner airCondition = new AirConditioner();
        airCondition.decreaseTemperature(17);
        assertEquals(17, airCondition.getThermostat());
   }


   @Test
    public void increaseTemperatureBeyondThirty(){
        AirConditioner airCondition = new AirConditioner();
        airCondition.increaseTemperatureBeyondThirty(31);
        assertEquals(30, airCondition.getThermostat());
   }
   
   @Test
    public void decreaseTemperatureBelowSixteen(){
        AirConditioner airCondition = new AirConditioner();
        airCondition.decreaseTemperatureBelowSixteen(15);
        assertEquals(16, airCondition.getThermostat());
   }


}
