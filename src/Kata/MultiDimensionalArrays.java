package Kata;
import java.util.Scanner;
public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][]arrays = {{1,2,3},{1,2,3}};
        int sum = 0;
        for (int[] array : arrays) {
            for (int i : array) {
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("The sum of numbers in the array is : " +sum);


        }
    }




