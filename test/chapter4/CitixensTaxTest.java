package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CitizensTaxTest {
    CitizenTax taxify;
    @BeforeEach
    public void BeginEachTestWith(){
        taxify = new CitizenTax();
    }
    @Test
    public void calculateTax(){
//        taxify.calculateTaxAmount(20,100);
        assertEquals(2, taxify.calculateTaxAmount(20,200));

    }
}
