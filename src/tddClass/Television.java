package tddClass;

public class Television {

    private boolean power;
    private int volume;
    private boolean mute;

    public void powerOn(boolean shinko) {

        if (shinko = true) {
            shinko = true;
        }
        power = true;
    }

    public Object getPower() {
        return power;
    }

    public void powerOff(boolean shinko) {
        if (shinko = false){
            shinko = false;
        }
        power = false;
    }

    public void increaseVolume(int shinko) {
        if (shinko == 0){
            shinko = 0 + 1;
        }
        volume = shinko;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume(int shinko) {
        if (shinko == 1 ){
            shinko = 1-1;
        }
        volume = shinko;
    }

    public void muteVolume(boolean shinko) {
        if (shinko = false) {
            shinko = false;
        }
        mute = shinko;
    }

    public void unmuteVolume(boolean shinko) {
        if (shinko = true) {
            shinko = true;
        }
        mute = shinko;
    }

    public boolean getState() {
        return mute;
    }
}
