package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import javax.swing.text.Position;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertNotNull;

public class TurtleTest {
    Turtle ijapa;
    private SketchPad sc;

    @BeforeEach
    public void setUp() {
    ijapa = new Turtle();
    sc = new SketchPad(5,5);
    }

    @Test
    public void turtleCanBeCreatedTest() {
        assertNotNull(ijapa);
    }

    @Test
    public void penIsUpByDefaultTest() {
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanBeMovePenDownTest() {
        assertTrue(ijapa.isPenUp());
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtlePenCanGoBackUp(){
        ijapa.penDown();
        assertFalse(ijapa.isPenUp());

        ijapa.penCanGoBackUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void whenFacingEastTurtleTurnRightSouth(){
        assertSame(EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getCurrentDirection());

    }
    @Test
    public void whenFacingNorthTurtleTurnRightEast(){
        assertSame(EAST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST,ijapa.getCurrentDirection());

    }
    @Test
    public void whenFacingEastTurtleTurnLeftToNorth(){
        assertSame(EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH,ijapa.getCurrentDirection());

    }

    @Test
    public void whenFacingNorthTurtleCanTurnWest(){
        assertSame(EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST,ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardFacingEastTest() {
        assertSame(EAST,ijapa.getCurrentDirection());
        ijapa.move(5,sc);
        ijapa.move(5,sc);
        TurtlePosition expectedPosition = new TurtlePosition(0,10);
        assertEquals(expectedPosition, ijapa.getCurrentDirection());
    }

//    @Test
//    public void whenPenIsDown_turtleCanWrittenWhileMovingTest() {
//        assertSame(EAST,ijapa.getCurrentDirection());
//    }
}
