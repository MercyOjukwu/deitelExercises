package chapter5;

public class NumbersDivisibleBy3Test {
    public static void main(String[] args) {
        int countOfDivisible = 0;
        System.out.println("Numbers between 1 - 30 are:   ");
        for(int number = 0; number <= 30; number++){
            System.out.print(" "+number);
            if (number % 3 == 0){ countOfDivisible+= number;}
        }

        System.out.println();
        System.out.println("The sum of numbers divisible by three are "+countOfDivisible);
    }
}


