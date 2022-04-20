package eBanking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAccountTest{

    MyAccount kudaAccount;
    @BeforeEach
    public void beginEveryMethodWith(){
        kudaAccount = new MyAccount();
    }
    @Test
    public void accountNameCanBeAssignedTest(){
    kudaAccount.setAccountName("Mercy Ojukwu");
    assertEquals("Mercy Ojukwu" ,  kudaAccount.getAccountName());

    }

    @Test
    public void accountNumberCanBeAsssignedTest(){
    kudaAccount.setAccountNumber("1");
    assertEquals("1",kudaAccount.getAccountNumber());
    }

    @Test
    public void accountPinCanBeAssignedTest(){
    kudaAccount.setPin("1234");
    assertEquals("1234", kudaAccount.getPin());
    }

    @Test
    public void canDepositIntoAccountTest(){
    kudaAccount.deposit(5000, "1");
    assertEquals(5000,kudaAccount.getBalance());
    }

    @Test
    public void canWithdrawFromAccountTest(){
    kudaAccount.deposit(5000,"1");
    kudaAccount.withdraw(2000,"1234");
    assertEquals(3000,kudaAccount.getBalance());
    }

    @Test
    public void withdrawWithWrongNumberTest(){}





































}
