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
        if (myRide = false) {
            isOn = false;
        }


    }


    public boolean getState() {
        return isOn;
    }


    public void acceleration(int myRide) {
        if (myRide > 0 && myRide< 20) {
            speed = myRide++;
        }


    }

        public int getSpeed () {
            return speed;
        }


    /* public void accelerateTwice(int myRide) {
        myRide = 0;
        do {speed = myRide += 2 ;} while(  myRide < 31);
    } */
 }


