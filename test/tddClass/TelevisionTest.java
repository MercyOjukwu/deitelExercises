package tddClass;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {


   @Test
   public void powerOn(){

   //given
   Television shinko = new Television();

   //when
   shinko.powerOn(true);

   //assert
    assertEquals(true, shinko.getPower());

   }

   @Test
   public void powerOff(){
   Television shinko = new Television();
   shinko.powerOff(false);
   assertEquals(false, shinko.getPower());
   }



   @Test
   public void increaseVolume(){
      Television shinko = new Television();
      shinko.increaseVolume(0);
      assertEquals(1, shinko.getVolume());
   }


   @Test
   public void decreaseVolume(){
      Television shinko = new Television();
      shinko.decreaseVolume(1);
      assertEquals(0, shinko.getVolume());
   }


   @Test
   public void muteVolume(){
      Television shinko = new Television();
      shinko.muteVolume(false);
      assertEquals(false, shinko.getState());
   }


   @Test
   public void unmuteVolume(){
      Television shinko = new Television();
      shinko.unmuteVolume(true);
      assertEquals(true, shinko.getState());
   }
}


