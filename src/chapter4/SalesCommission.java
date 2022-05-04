package chapter4;

public class SalesCommission {
    private static double profit;
    private static double weeklyGrossProfit;

    public static double calculateProfit( double priceOfItems, int noOfItems) {
        weeklyGrossProfit = priceOfItems * noOfItems;
        profit = 200 + (0.09 * weeklyGrossProfit) ;
        return profit;
    }

    public static double getProfit() {
        return profit;
    }
}
