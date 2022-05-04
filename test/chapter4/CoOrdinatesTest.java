package chapter4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoOrdinatesTest {
    @Test
    public void calculateDistance_BetweenPints(){
        CoOrdinates dist = new CoOrdinates();
        dist.calculateDistance(5,6,4,6);
        assertEquals(2.23606797749979, dist.getDistance());
    }
}
