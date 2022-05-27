package turtle;

import static turtle.Direction.*;

public class Turtle {

    private Pen bik = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);
    private int numberOfSteps;
    public boolean isPenDown() {
        return  bik.isDown();
    }

    public  void penDown() {
        bik.penDown();
    }


    public void penUp() {
        bik.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == NORTH) face(EAST);
        else if(currentDirection == WEST) face(NORTH);
        else if(currentDirection == SOUTH) face(WEST);
        else face(SOUTH);
    }

    public void turnLeft() {
        if(currentDirection == SOUTH) face(EAST);
        else if (currentDirection == WEST) face(SOUTH);
        else if(currentDirection == NORTH) face(WEST);
        else  face(NORTH);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void move(int noOfSteps) {
        this.numberOfSteps = noOfSteps;
    }

    public Position getCurrentPosition() {
        return new Position(0, numberOfSteps - 1);
    }
}
 