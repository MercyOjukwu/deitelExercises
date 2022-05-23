package chapter7;

public class Airline {
    private String location;
    private int[] seats = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int seatNumber;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void selectSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        for(int seat : seats){ seat = seatNumber;}
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void selectNumberOfSeats(int numberOfSeats) {

    }
}
