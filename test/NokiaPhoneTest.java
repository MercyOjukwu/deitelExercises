import chapter4.NokiaPhone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NokiaPhoneTest {

    @Test
    public void openMainMenuTest(){
     //given
     NokiaPhone nokia33 = new NokiaPhone();
     //when
     nokia33.openMainMenu(1);
     //assert
     assertEquals("List of menu functions:\n  1.Phone book\n  2.Messages\n  3.Chat\n  4.Call register\n ", nokia33.openMainMenu(1));
    }




}
