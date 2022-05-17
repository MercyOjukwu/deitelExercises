package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CryptoTest {

    MyCrypto encrypt;

    @BeforeEach
    public void beginEachTestWith(){
        encrypt = new MyCrypto();
    }
    @Test
    public void createClass_collectIntValue() {
        encrypt.takeInValue(1234);
        assertEquals(1234, encrypt.getValue());
    }

    @Test
    public void convertValueToString(){
        encrypt.convertValueToString(1234);
        assertEquals("1234", encrypt.getStringValue());
    }

    @Test
    public void convertToStringArray(){
       encrypt.convertStringToArray();
        assertNull(encrypt.bringArrayValue());

    }
}