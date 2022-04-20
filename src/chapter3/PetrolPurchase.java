package chapter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantityPerLitre;
    private int pricePerLitre;
    private double percentageDiscount;
    private double netAmount;


    public void setLocation(String location) {
        this.location = location;

    }

    public String getLocation() {return location;}

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolQuantityPerLitre(int quantityPerLitre) {
        this.quantityPerLitre = quantityPerLitre;
    }

    public int getPetrolQuantityPerLitre() {
        return quantityPerLitre;
    }

    public void setPricePerLitre(int pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }


    public int getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double dividend , int divisor) {
        percentageDiscount = dividend / divisor;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPurchaseAmount(int pricePerLitre, int quantityPerLitre,double percentageDiscount) {
        this.quantityPerLitre = quantityPerLitre;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;

      netAmount = quantityPerLitre * pricePerLitre - percentageDiscount;
    }

    public double getPurchaseAmount() {
        return netAmount;
    }
}
