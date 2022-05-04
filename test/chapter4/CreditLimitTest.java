package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitTest {
    CreditLimit pay_up;
    @BeforeEach
    public void beginEachTestWith(){
        pay_up = new CreditLimit();
    }

    @Test
    public void accountNumberExists(){
       pay_up.setAccountNo("123456");
       assertEquals("123456",pay_up.getAccountNo());

    }
    @Test
    public void depositIntoAccount_CheckBalance(){
        pay_up.depositIntoAccount(1000);
        assertEquals(1000, pay_up.getAccountBalance());
    }
    @Test
    public void checkTotalOfCustomersSpending(){
        pay_up.calculateCostOfGoods(100,500,600);
        assertEquals(1200, pay_up.getCostOfGoods());
    }
    @Test
    public void customerHasCreditLimit(){
        pay_up.setCreditLimit(5000);
        assertEquals(5000, pay_up.getCreditLimit());
    }
    @Test
    public void customerCanUseCredits(){
        pay_up.calculateCostOfGoods(1100,200,100);
        pay_up.setCreditLimit(5000);
        assertEquals("Approved!", pay_up.getPurchaseMessage());
    }
    @Test
    public void calculateNewBalance(){
        pay_up.depositIntoAccount(10_000);
        pay_up.setCreditLimit(20_000);
        pay_up.calculateNewBalance(10_000,5000,4000);
        assertEquals(11_000, pay_up.getNewBalance());
        assertEquals("Approved!", pay_up.getPurchaseMessage());
    }
}
