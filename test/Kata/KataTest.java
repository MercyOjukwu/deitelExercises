package Kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class KataTest {

    @Test
    public void numberTester() {

        //given
        Kata palindrome = new Kata();
        //when
        palindrome.numberTester(0);
        //assert
        assertEquals(true, palindrome.getResult());
    }

    @Test
    public void utmePricingTest() {

        //given
        Kata testDriller = new Kata();

        //when
        testDriller.utmePricing(4);

        //assert
        assertEquals(8000, testDriller.getTotal());
    }

    @Test
    public void utmePricingTest2() {

        Kata testDriller = new Kata();
        testDriller.utmePricing(5);
        assertEquals(9000, testDriller.getTotal());
    }

    @Test
    public void utmePricingTest3() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(10);
        assertEquals(16_000, testDriller.getTotal());
    }


    @Test
    public void utmePricingTest4() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(30);
        assertEquals(45_000, testDriller.getTotal());
    }


    @Test
    public void utmePricingTest5() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(50);
        assertEquals(65_000, testDriller.getTotal());

    }

    @Test
    public void utmePricingTest6() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(100);
        assertEquals(120_000, testDriller.getTotal());

    }


    @Test
    public void utmePricingTest7() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(200);
        assertEquals(220_000, testDriller.getTotal());

    }


    @Test
    public void utmePricingTest8() {
        Kata testDriller = new Kata();
        testDriller.utmePricing(500);
        assertEquals(500_000, testDriller.getTotal());


    }

    @Test
    public void numberDivisionTest() {
        Kata quotient = new Kata();
        quotient.numberDivision(100, 4);
        assertEquals(25, quotient.getResult());
    }

    @Test
    public void evenNumberCount() {
        int number = 2;
        while (number <= 100) {
            System.out.print(number + " " );
            number = number + 2;
        }

    }

}





