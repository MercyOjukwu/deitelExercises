package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DieselAppTest {

    MeasureDiesel diesel;
    @BeforeEach
    public void startEachTestWith(){
        diesel = new MeasureDiesel();
    }
    @Test
    public void classCanBeCreated(){
        MeasureDiesel diesel = new MeasureDiesel();
    }

    @Test
    public void getNumberOfMilesDriven(){
        diesel.setNumberOfMilesDriven(20);
        assertEquals(20, diesel.getNumberOfMilesDriven());
    }

    @Test
    public void getNumberOfGallonsUsed_PerTrip(){
        diesel.setNumberOfGallonsUsed_PerTrip(5);
        assertEquals(5, diesel.getNumberOfGallonsUsed_PerTrip());
    }

    @Test
    public void displayNumberOfGallonsUsedPerTrip_MilesPerTrip(){
        diesel.setNumberOfMilesDriven(50);
        diesel.setNumberOfGallonsUsed_PerTrip(10);
        assertEquals("10 gallons for 50 miles: 1 gallon lasts for 5 miles.", diesel.displayNoOfMiles_GallonsUserPerTrip());

    }
















}
