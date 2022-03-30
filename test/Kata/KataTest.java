package Kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static sun.net.www.http.KeepAliveCache.result;


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


    @Test
    public void isEvenTest(){

        Kata number1 = new Kata();
        boolean result = number1.isEven(5);
        assertEquals(false,result);

    }

    @Test
    public void isLargestNumber() {
        Kata number = new Kata();
        int result = number.isLargestNumber(3, 4, 5, 6, 8);
        assertEquals(8, result);

        /* Kata number2 = new Kata();
        Kata number3 = new Kata();
        Kata number4 = new Kata();
        Kata number5 = new Kata(); */

    }

     @Test
     public void noOfFactorsTest(){
        Kata digit = new Kata();
        int result = digit.noOfFactors(5);
        assertEquals(2,result);


    }

    @Test
    public void isPrimeTest(){
        Kata prime = new Kata();
        boolean result = prime.isPrime(7);
        assertEquals(true, result );
    }


    
    /*  @Test
    public void displayAsteriks(){
        Kata figure = new Kata();
        int result = figure.displayAsteriks(5);
        assertEquals("*****",result );
    }


     */
}





