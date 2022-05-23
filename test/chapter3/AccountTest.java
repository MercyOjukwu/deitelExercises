package chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account funmiAccount;
    @BeforeEach
    public void beginAllMethodsWith(){
        funmiAccount = new Account();
    }

    @Test
    public void depositTest() {

        //given

        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());

    }


    @Test
    public void depositTwiceTest() {

        funmiAccount.deposit(500);
        funmiAccount.deposit(400);
        assertEquals(900, funmiAccount.getBalance());


    }

    @Test
    public void depositNegativeValueTest() {

        funmiAccount.deposit(1000);
        funmiAccount.deposit(-400);
        assertEquals(1000, funmiAccount.getBalance());
    }

    @Test
    public void withdraw() {

        funmiAccount.deposit(5000);
        funmiAccount.withdraw(2000);
        assertEquals(3000, funmiAccount.getBalance());


    }





}



