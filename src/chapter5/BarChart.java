package chapter5;

public class BarChart {
    public static void main(String[] args) {
        char asterisk = '*';
        for(int number = 0; number <= 30; number++){
            if(number % 5 == 0){
                System.out.println(number);
                for(int count= 0; count <=number; count++){
                    asterisk++;
                }
            }
        }
    }
}