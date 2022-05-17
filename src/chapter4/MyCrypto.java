package chapter4;

public class MyCrypto {

    private int value;
    private String newValue;
    private String[] numbers = new String[4];
    public void takeInValue(int fourDigitValue) {
        value = fourDigitValue;
    }

    public int getValue() {
        return value;
    }

    public void convertValueToString(int fourDigitNumber) {
        newValue = Integer.toString(fourDigitNumber);

    }

    public String getStringValue() {
        return newValue;
    }


    public void convertStringToArray() {

        for (int i = 0; i <= numbers.length; i++) {
             numbers[i] = newValue;
        }
    }

    public String bringArrayValue() {
        return numbers[0];
    }
}


