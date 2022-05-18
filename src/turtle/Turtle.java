package turtle;

import static turtle.Direction.*;

public class Turtle {

    private Pen bik = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition;
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
        if(currentDirection == SOUTH) face(WEST);
        if(currentDirection == EAST) face(SOUTH);
    }

    public void turnLeft() {
//        if(currentDirection == )
        if(currentDirection == NORTH) face(WEST);
        if(currentDirection == EAST) face(NORTH);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void move(int noOfSteps) {






















































































































































































































































































































        
    }

    public Position getCurrentPosition() {
        return null;
    }
}
 