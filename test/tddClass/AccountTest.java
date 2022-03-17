package tddClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void depositTest() {

        //given
        Account funmiAccount = new Account();
        //when
        funmiAccount.deposit(100);
        //assert
        assertEquals(100, funmiAccount.getBalance());

    }


    @Test
    public void depositTwiceTest() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(500);
        funmiAccount.deposit(400);
        assertEquals(900, funmiAccount.getBalance());


    }

    @Test
    public void depositNegativeValueTest() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(1000);
        funmiAccount.deposit(-400);
        assertEquals(1000, funmiAccount.getBalance());
    }

    @Test
    public void withdraw() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(5000);
        funmiAccount.withdraw(2000);
        assertEquals(3000, funmiAccount.getBalance());


    }

    @Test
    public void withdrawLargerAmount() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(1000);
        funmiAccount.withdrawLargerAmount(2500);
        assertEquals(1000, funmiAccount.getBalance());

    }


    @Test
    public void withdrawNegativeValue() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(1000);
        funmiAccount.withdrawNegativeValue(-500);
        assertEquals(1000, funmiAccount.getBalance());


    }




}



