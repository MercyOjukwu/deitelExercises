package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirLineReservationTest {
    AirLine airPeace;
    @BeforeEach
    public void beginEachTestWith(){
        airPeace = new AirLine();
    }

//    @Test public void testThatAirLineHasPlane(){
//        airPeace.isPlaneEmpty();
//    }

//    @Test public void testThatAirlineCanBookFlight(){
//        airPeace.reserveSeat(2);
//        assertEquals(2, airPeace.getSeatNumber());
//    }

}
