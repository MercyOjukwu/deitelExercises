package eBanking;

public class MyAccount {

    private String accountName;
    private String accountNumber;
    private String pin;
    private int amount;
    private int balance;

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber= accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void deposit(int amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        balance+=amount;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount, String pin) {
        this.amount = amount;
        this.pin = pin;
        balance-=amount;
    }
}
