package chapter2;

public class AutomaticBike {

    private boolean isOn;
    private int speed;

    public void powerOn() { isOn = true;}
    public void powerOff() { isOn = false; }
    public boolean getState() {
        return isOn;
    }


    public void acceleration(int myRide) {
        if (myRide > 0 && myRide < 20) {speed = myRide+ 1;}
        if (myRide > 20 && myRide < 31){ speed = myRide + 2;}
        if (myRide > 31 && myRide < 41){ speed = myRide + 3;}
        if (myRide > 41){speed = myRide + 4;}

    }

    public int getSpeed () {
            return speed;
        }

    public void deceleration(int myRide) {
        if (myRide > 0 && myRide < 20) {speed = myRide - 1;}
        if (myRide > 20 && myRide < 31){ speed = myRide -  2;}
        if (myRide > 31 && myRide < 41){ speed = myRide - 3;}
        if (myRide > 41){speed = myRide - 4;}
    }
}


