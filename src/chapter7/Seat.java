package chapter7;

public class Seat {
    private int[] numbers;
    public void reserveSeat() {
        for(int seats : numbers){
            if(seats == 0){ seats = Plane.seatNumber;}
        }
    }
}
