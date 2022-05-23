package chapter3;

public class AirConditioner {

    private boolean power;
    private int temperature = 16;

    public void powerOn() {
      power = true;
    }

    public boolean getPower(){
        return power;
    }

    public void powerOff() {
        power = false;
    }

    public void increaseTemperature(int incrementBy) {
        temperature += incrementBy;
        if(temperature > 30) temperature = 30;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature(int decrementBy) {
        temperature -= decrementBy;
        if(temperature < 16) temperature = 16;
    }

}