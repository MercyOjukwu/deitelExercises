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


}
