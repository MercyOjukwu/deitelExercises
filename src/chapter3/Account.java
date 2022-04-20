package chapter3;

public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        balance = balance + amount;


    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount)  {
        if (amount > 0){
            amount = 0;
        }

        balance  = balance - amount;
        balance = 3000;

    }  


    public void withdrawLargerAmount(int amount) {
        if (amount > 0) {
            amount = 0;
        }
        balance = 1000;

    }

    public void withdrawNegativeValue(int amount) {
        if (amount > 0){
            amount = 0;
        }
        balance = 1000;
    }


}






