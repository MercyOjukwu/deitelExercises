package chapter3;

public class Television {

    private boolean power;
    private int volume;
    private boolean mute;

    public void powerOn() {
        power = true;
    }

    public Object getPower() {
        return power;
    }

    public void powerOff() {
        power = false;
    }

    public void increaseVolume(int incrementBy) {
       if (incrementBy > 0) volume = incrementBy;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume(int decrementBy) {
       if(decrementBy > 0) volume -= decrementBy;
    }

    public void muteVolume() {
        mute = false;
    }

    public void unmuteVolume() {
        mute = true;
    }

    public boolean getState() {
        return mute;
    }
}
