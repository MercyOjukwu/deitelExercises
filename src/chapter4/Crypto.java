//package chapter4;
//
//import java.lang.reflect.Array;
//
//public class Crypto {
//    private String string;
//    private int fourDigitNumber;
//    private String[] digit;
//    private int firstDigit;
//    private int secondDigit;
//    private int thirdDigit;
//    private int fourthDigit;
//
//    public void collectIntValue(int fourDigitNumber) {
//        this.fourDigitNumber = fourDigitNumber;
//    }
//
//    public int returnIntValue() {
//        return fourDigitNumber;
//    }
//
//    public void convertIntegerIntoString(int fourDigitNumber) {
//        this.fourDigitNumber = fourDigitNumber;
//        string = Integer.toString(fourDigitNumber);
//    }
//
//    public String displayStringVersionOfInteger() {
//        return string;
//    }
//
//    public void convertStringInteger_toArray(String fourDigitNumber) {
//        string = String.toArray(fourDigitNumber);
////        string = fourDigitNumber;
////        firstDigit = string.charAt(0);
//        secondDigit = string.charAt(1);
//        thirdDigit = string.charAt(2);
////        fourthDigit = string.charAt(3);
//    }
//
//
//    public int displayFirstDigit_In_IntegerString() {
//        return firstDigit;
//    }
//
//    public void replaceDigits(String fourDigitNumber) {
//
//
//    }
//
//    public int getDigitReplacement() {
//        return firstDigit;
//    }
//}
//






//You can convert a number into String and then you can use toCharArray() or split() method to separate the number into digits