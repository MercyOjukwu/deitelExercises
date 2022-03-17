package tddClass;

public class AirConditioner {

    private boolean power;
    private int thermostat;
    public void powerOn(boolean airCondition) {

        if (airCondition = true) {
            airCondition = true;
        }
      power = true;
    }

    public boolean getPower(){

        return power;
    }

    public void powerOff(boolean airCondition) {
        if(airCondition = false){
            airCondition = false;
        }
        power = false;
    }

    public void increaseTemperature(int airCondition) {
        if (airCondition > 30){
            airCondition = 30;

        }
        thermostat = 28;
    }

    public int getThermostat() {
        return thermostat;
    }


    public void decreaseTemperature(int airCondition) {
        if(airCondition < 16){
            airCondition = 16;
        }
        thermostat = 17;
    }

    public void increaseTemperatureBeyondThirty(int airCondition) {
        if(airCondition > 30){
            airCondition = 30;
        }
        thermostat = 30;
    }

    public void decreaseTemperatureBelowSixteen(int airCondition) {
        if(airCondition < 16){
            airCondition = 16;
        }
        thermostat = 16;

    }
}