package chapter3;

public class Account {
    private int balance;

    public void deposit(int amount) { balance += amount; }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount)  { if (amount > 0) balance -= amount; }




}






