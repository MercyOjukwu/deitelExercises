package chapter4;

public class CoOrdinates {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double distance;

    public void calculateDistance(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is " + distance);

    }

    public double getDistance() {
        return distance;
    }
}