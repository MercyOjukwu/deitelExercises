package chapter2;

import static chapter2.Addition.input;

public class AutomaticBike {


    private boolean isOn;
    private int speed;


    public AutomaticBike() {
    }


    public void isOn(boolean myRide) {

        if (myRide = true) {
            isOn = true;
        }


    }

    public void isOff(boolean myRide) {
        if (myRide = false){
            isOn = false;
        }




    }



    public boolean getState() {
        return isOn;
    }



    public void acceleration(int myRide) {
         myRide = 0;
         while( myRide  < 21 ) {speed = myRide++ ; }
        while( myRide < 21 && myRide < 31){speed = myRide + 2 ;}



    }

        public int getSpeed () {
            return speed;
        }




}
