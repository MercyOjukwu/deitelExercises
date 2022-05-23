package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

   Television shinko;
   @BeforeEach
   public void beginEachTestWith(){
      shinko = new Television();
   }

   @Test
   public void powerOn(){
    shinko.powerOn();
    assertTrue((Boolean) shinko.getPower());
   }

   @Test
   public void powerOff(){
   shinko.powerOff();
   assertFalse((Boolean) shinko.getPower());
   }

   @Test
   public void increaseVolume(){
      shinko.increaseVolume(1);
      assertEquals(1, shinko.getVolume());
   }

   @Test
   public void decreaseVolume(){
      shinko.increaseVolume(2);
      shinko.decreaseVolume(1);
      assertEquals(1, shinko.getVolume());
   }

   @Test
   public void muteVolume(){
      shinko.muteVolume();
      assertFalse(shinko.getState());
   }

   @Test
   public void unmuteVolume(){
      shinko.unmuteVolume();
      assertTrue(shinko.getState());
   }
}


