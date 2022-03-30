package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaticBikeTest {

    @Test
    public void isOnTest() {

        //given
        AutomaticBike myRide = new AutomaticBike();

        //when
        myRide.isOn(true);

        //assert
        assertEquals(true, myRide.getState());

    }


    @Test
    public void accelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.acceleration(19);
        assertEquals(20, myRide.getSpeed());
    }


    @Test
    public void secondAccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.acceleration(26);
        assertEquals(28, myRide.getSpeed());
    }

    @Test
    public void thirdAccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.acceleration(33);
        assertEquals(36, myRide.getSpeed());
    }

    @Test
    public void fourthAccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.acceleration(42);
        assertEquals(46, myRide.getSpeed());
    }

    @Test
    public void firstDeccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.decceleration(11);
        assertEquals(10, myRide.getSpeed());
    }


    @Test
    public void secondDeccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.decceleration(28);
        assertEquals(26, myRide.getSpeed());
    }

    @Test
    public void thirdDeccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.decceleration(38);
        assertEquals(35, myRide.getSpeed());
    }

    @Test
    public void fourthDeccelerationTest() {
        AutomaticBike myRide = new AutomaticBike();
        myRide.isOn(true);
        myRide.decceleration(50);
        assertEquals(46, myRide.getSpeed());
    }



}
