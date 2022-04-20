package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {

    PetrolPurchase station;
    @BeforeEach
    public void assignBeforeEach(){
        station = new PetrolPurchase();
    }

    @Test
    public void createClassPetrolPurchase(){
        station.setLocation("Chibuzo's village");
        assertEquals("Chibuzo's village" , station.getLocation());
    }

   @Test
    public void createPetrolTypeTest(){
        station.setPetrolType("Fuel");
        assertEquals("Fuel", station.getPetrolType());
   }

   @Test
    public void createPetrolQuantityVariable(){
        station.setPetrolQuantityPerLitre(5);
        assertEquals(5, station.getPetrolQuantityPerLitre());
   }

   @Test
    public void createPetrolPricePerLitreVariable(){
        station.setPricePerLitre(100);
        assertEquals(100,station.getPricePerLitre());
   }

   @Test
    public void createPercentageDiscountVariable(){
        station.setPercentageDiscount(10,100);
        assertEquals(0.1, station.getPercentageDiscount());
   }

   @Test
    public void getPurchaseAmountTest(){
       station.setPurchaseAmount(100, 5, 50);
       assertEquals(450, station.getPurchaseAmount());
   }


}
