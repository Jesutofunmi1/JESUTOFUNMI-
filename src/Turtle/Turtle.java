package Turtle;
import javax.swing.text.Position;

import static Turtle.Direction.*;
public class Turtle {

    private boolean isPenUp = true;
    private Direction currentDirection = EAST;

    private TurtlePosition currentPosition = new TurtlePosition(0, 0);


    public boolean isPenUp() {
        return isPenUp;

    }

    public void penDown() {
        isPenUp = false;
    }

    public void penCanGoBackUp() {

        isPenUp = true;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = WEST;
            case WEST -> currentDirection = NORTH;
            case NORTH -> currentDirection = EAST;
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> currentDirection = NORTH;
            case NORTH -> currentDirection = WEST;
            case WEST -> currentDirection = SOUTH;
            case SOUTH -> currentDirection = EAST;
        }
    }

    public void move(int numOfSteps, SketchPad sketchPad) {
        if(!isPenUp) writeOn(sketchPad, numOfSteps);

    }

    private void writeOn(SketchPad sketchPad, int numOfSteps) {
    int [][] floor = sketchPad.getFloor();
    int currentRow = currentPosition.getRow();
    int currentColumn = currentPosition.getColumn();
    switch (currentDirection){
        case EAST -> {
            for (int i = 0; i <currentColumn + numOfSteps; i++) {
                floor[currentRow][i] = 1;

            }
        }
    }
    }
}
