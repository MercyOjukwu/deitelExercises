package chapter3;

public class Clock {
    
    private static int hour = 1 ;
    private static int minute = 40 ;
    private static int second = 10;
    private static String time = hour+ ":" +minute+ ":" +second;


    public static void main(String[] args) {
//        Clock.setTime(1, 40 ,10);
        Clock.displayTime();
    }

    public void createAttributes(int hour, int minute, int second) {

        if(hour > 23) throw new IllegalArgumentException("The hour can only between 0 - 23");
        if(minute > 59) throw new IllegalArgumentException("The minute can only between 0 - 59");
        if(second > 59) throw new IllegalArgumentException("The hour can only between 0 - 59");

        Clock.hour = hour;
        Clock.minute = minute;
        Clock.second = second;
    }

    public static String displayTime() {
        System.out.println(time);
        return time;
    }


}
