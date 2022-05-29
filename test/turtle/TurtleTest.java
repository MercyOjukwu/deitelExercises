package turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    private Turtle tote;
    SketchPad sketchPad;
    @BeforeEach public void beginEachTestWith(){
        tote = new Turtle();
        sketchPad = new SketchPad(5,5);
    }

    @Test public void turtleHasPenTest(){
        tote.isPenDown();
    }

    @Test public void turtleCanMovePenDownTest(){
        assertFalse(tote.isPenDown());
        tote.penDown();
        boolean isPenDown = tote.isPenDown();
        assertTrue(isPenDown);
    }

    @Test public void turtleCanMovePenUpTest(){
        tote.penUp();
        assertFalse(tote.isPenDown());
    }

    @Test public void turtleFacesEstByDefault(){
        assertEquals(EAST,tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveRightFromEast(){
        tote.turnRight();
        assertSame(SOUTH, tote.getCurrentDirection());
    }

    @Test public void turtleCanTurnRightFromSouthTest(){
        tote.turnRight();
        tote.turnRight();
        assertSame(WEST, tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveRightFromWestTest(){
        tote.turnRight();
        tote.turnRight();
        tote.turnRight();
        assertSame(NORTH, tote.getCurrentDirection());

    }

    @Test public void turtleCanMoveRightFromNorthTest(){
        tote.turnRight();
        tote.turnRight();
        tote.turnRight();
        tote.turnRight();
        assertSame(EAST, tote.getCurrentDirection());

    }
    @Test public void turtleCanTurnLeftWhileFacingEastTest(){
        tote.turnLeft();
        assertSame(NORTH, tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveLeftFromNorthTest(){
        tote.turnLeft();
        tote.turnLeft();
        assertSame(WEST, tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveLeftFromWestTest(){
        tote.turnLeft();
        tote.turnLeft();
        tote.turnLeft();
        assertSame(SOUTH, tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveLeftFromSouthTest(){
        tote.turnLeft();
        tote.turnLeft();
        tote.turnLeft();
        tote.turnLeft();
        assertSame(EAST, tote.getCurrentDirection());
    }

    @Test public void turtleCanMoveTest(){
        tote.move(5, sketchPad);
        assertEquals(new Position(0, 4), tote.getCurrentPosition());
    }

    @Test public void turtleCanMoveForwardFacingEast(){
        tote.move(3, sketchPad);
        assertEquals(new Position(0,2), tote.getCurrentPosition());
        tote.move(2,sketchPad);
        assertEquals(new Position(0,1), tote.getCurrentPosition());
    }

    @Test public void turtleCanMoveForwardFacingSouthTest(){
        tote.move(8, sketchPad);
        assertEquals(new Position(0,7), tote.getCurrentPosition());

    }

    @Test public void turtleCanMoveForwardFacingWestTest(){
        tote.move(12, sketchPad);
        assertEquals(new Position(0, 11), tote.getCurrentPosition());
    }

    @Test public void turtleCanMoveForwardFacingNorthTest(){
        tote.move(18, sketchPad);
        assertEquals(new Position(0, 17), tote.getCurrentPosition());
    }

    @Test public void turtleWritesFacingEastTest(){
        tote.move(5, sketchPad);

    }

//    @Test
//    public void whenPenIsDDown_turtleWritesFacingEastTest(){
//        tote.penDown();
//        SketchPad sketchPad = new SketchPad(5,5);
//        tote.move(5, sketchPad);
//        String expected = """
//				* * * * *
//
//
//
//
//				""";
//        assertEquals(expected, sketchPad.toString());
//    }
}
