package chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class ArraysExercisesTest {
    public static void main(String[] args) {
        int[] scores = new int[6];
        char[] characters = {'a','b', 'c', 'A', 'B', 'C'};
       String password = "";
        SecureRandom sc = new SecureRandom();

       for(int i = 0; i < 12; i++) {
           int index = sc.nextInt(characters.length - 1);
           password += characters[index];

       }
        System.out.println(password);

       //generate random index
        //use random index to get character
        //concat character to previous character


    }



































}
