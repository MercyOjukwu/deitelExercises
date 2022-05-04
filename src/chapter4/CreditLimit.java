package chapter4;

public class CreditLimit {
    private String accountNo;
    private int initialBalance;
    private int totalAmountOfGoods;
    private int credits;
    private  int allowedCreditLimit;
    private String purchaseMessage;
    private int newBalance;

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
    return accountNo;
    }

    public void depositIntoAccount(int amount) {
        initialBalance += amount;
    }

    public int getAccountBalance() {
        return initialBalance;
    }

    public void calculateCostOfGoods(int amountOne, int amountTwo, int amountThree) {
       totalAmountOfGoods = amountOne + amountTwo + amountThree;
    }

    public int getCostOfGoods() {
        return totalAmountOfGoods;
    }

    public void setCreditLimit(int creditLimit) {
        this.allowedCreditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return  allowedCreditLimit;
    }


    public String getPurchaseMessage() {
        if (newBalance < allowedCreditLimit) {
            purchaseMessage = "Approved!";
        }
        else { purchaseMessage = "Dear customer, you have exceeded your credit limit";}
        return purchaseMessage;
    }

    public void calculateNewBalance( int initialBalance, int totalAmountOfGoods, int credits) {
       this.initialBalance = initialBalance; this.totalAmountOfGoods = totalAmountOfGoods; this.credits = credits;
        newBalance = initialBalance + totalAmountOfGoods - credits;
    }

    public int getNewBalance() {
        return newBalance;
    }
}
