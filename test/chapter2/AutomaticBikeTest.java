package chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    AutomaticBike myRide;

    @BeforeEach
    public void beginEachTestWith(){
        myRide = new AutomaticBike();
    }

    @Test
    public void bikeCanTurnOnTest() {
        myRide.powerOn();
        assertTrue(myRide.getState());
    }

    @Test
    public void bikeCanTurnOffTest(){
        myRide.powerOff();
        assertFalse(myRide.getState());
    }

    @Test
    public void accelerationTest() {
        myRide.powerOn();
        myRide.acceleration(19);
        assertEquals(20, myRide.getSpeed());
    }

    @Test
    public void secondAccelerationTest() {
        myRide.powerOn();
        myRide.acceleration(26);
        assertEquals(28, myRide.getSpeed());
    }

    @Test
    public void thirdAccelerationTest() {
        myRide.powerOn();
        myRide.acceleration(33);
        assertEquals(36, myRide.getSpeed());
    }

    @Test
    public void fourthAccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.powerOn();
        myRide.acceleration(42);
        assertEquals(46, myRide.getSpeed());
    }

    @Test
    public void firstDecelerationTest() {
        myRide.powerOn();
        myRide.deceleration(11);
        assertEquals(10, myRide.getSpeed());
    }


    @Test
    public void secondDecelerationTest() {
        myRide.powerOn();
        myRide.deceleration(28);
        assertEquals(26, myRide.getSpeed());
    }

    @Test
    public void thirdDecelerationTest() {
        myRide.powerOn();
        myRide.deceleration(38);
        assertEquals(35, myRide.getSpeed());
    }

    @Test
    public void fourthDecelerationTest() {
        myRide.powerOn();
        myRide.deceleration(50);
        assertEquals(46, myRide.getSpeed());
    }



}
