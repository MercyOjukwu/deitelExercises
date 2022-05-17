package chapter5;

public class SumOfASeries {
    public static void main(String[] args) {
        long sum = 0;
        System.out.printf("%s %15s ", "Numbers","Sum");
        System.out.println();
        for(long count = 0; count <= 100; count++ ){
            System.out.println(count);
            sum+=count;
            System.out.println("                    "+sum);

        }
    }
}
