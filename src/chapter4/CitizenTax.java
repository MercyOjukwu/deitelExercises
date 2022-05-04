package chapter4;

public class CitizenTax {
    private static double tax;

    public static double calculateTaxAmount(int taxPercent,int yearlyEarning ) {

       return tax = yearlyEarning * (taxPercent/100);

    }

//    public double getTaxAmount() {
//        return tax;
//    }
}
