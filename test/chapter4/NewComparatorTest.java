package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewComparatorTest {
    NewComparator caris;
    @BeforeEach
    public void beginEachTestWith(){
        caris = new NewComparator();
    }
   @Test public void collectNumbers(){
       caris.collectInput(2,4);
       assertEquals(6,caris.getUserInput());
   }

    @Test public void compareNumbers(){
//       caris.compareNumbers(firstInput, secondInput);
//       assertEquals(secondInput, caris.getLargerNumber());
    }

}
