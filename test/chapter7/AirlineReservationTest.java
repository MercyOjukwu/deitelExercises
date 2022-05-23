package chapter7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineReservationTest {

    Airline airPeace;
    @BeforeEach
    public void beginEachTestWith(){
        airPeace = new Airline();
    }

    @Test
    public void testThatClassCanBeCreated(){
       airPeace.setLocation("Lagos");
       assertEquals("Lagos", airPeace.getLocation());
    }

    @Test
    public void selectSeatNumber(){
        airPeace.selectSeatNumber(4);
        assertEquals(4, airPeace.getSeatNumber());
    }
//
//    @Test
//    public void selectNumberOfSeats(){
//        airPeace.selectNumberOfSeats(2);
//        assertEquals(2, airPeace.getNumberOfSeats());
//    }
}
