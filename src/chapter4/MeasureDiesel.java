package chapter4;

public class MeasureDiesel {

    private int noOfMiles;
    private int noOfGallonsPerTrip;

    public void setNumberOfMilesDriven(int noOfMiles) { this.noOfMiles = noOfMiles; }

    public int getNumberOfMilesDriven() { return noOfMiles; }

    public void setNumberOfGallonsUsed_PerTrip(int noOfGallonsPerTrip) { this.noOfGallonsPerTrip = noOfGallonsPerTrip;}

    public int getNumberOfGallonsUsed_PerTrip() { return noOfGallonsPerTrip;}

    public String displayNoOfMiles_GallonsUserPerTrip() {
        return noOfGallonsPerTrip+ " gallons for " +noOfMiles+ " miles: 1 gallon lasts for " +noOfMiles/noOfGallonsPerTrip+ " miles.";
    }
}

