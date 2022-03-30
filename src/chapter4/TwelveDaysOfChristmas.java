package chapter4;

public class TwelveDaysOfChristmas {


    public static void main(String[] args) {
        displayVerse();

    }

    private static void displayVerse() {
        for (int days = 1; days <= 12; days++) {

            switch (days){
                case 12:
                System.out.println("On the twelfth day of Christmas ");
                System.out.println("12 drummers drumming");


                case 11:
                    System.out.println(" On the eleventh day of Christmas ");
                    System.out.println("11 pipers piping");

                case 10:
                    System.out.println("On the tenth day of christmas ");
                    System.out.println(" Ten lords a-leaping");

                case 9:
                    System.out.println("On the ninth day of christmas ");
                    System.out.println(" Nine ladies dancing");


                case 8:
                    System.out.println("On the eighth day of christmas ");
                    System.out.println(" Eight maids a milking");


                case 7:
                    System.out.println("On the seventh day of christmas ");
                    System.out.println("Seven swans a swimming");



                case 6:
                    System.out.println("On the sixth day of christmas ");
                    System.out.println("Six geese a laying ");



                case 5:
                    System.out.println("On the fifth day of christmas ");
                    System.out.println(" Five golden rings");



                case 4:
                    System.out.println("On the fourth day of christmas ");
                    System.out.println(" Four calling birds");



                case 3:
                    System.out.println("On the third day of christmas ");
                    System.out.println("Three french hens");



                case 2:
                    System.out.println("On the second day of christmas ");
                    System.out.println(" Two turtle doves");



                case 1:

                    System.out.println("On the first day of christmas ");
                    System.out.println(" A partridge in a pear tree");
                    System.out.println();


            }
        }

    }



}





