package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionTest {
    SalesCommission newSales;
    @BeforeEach
    public void beginEachTestWith(){
        newSales = new SalesCommission();
    }

    @Test
    public void calculateProfit(){
    newSales.calculateProfit(239.99,1);
    assertEquals( 221.5991, newSales.getProfit());

    }
}
