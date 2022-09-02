package Turtle;

import javax.swing.text.Position;

public class TurtlePosition {

    private int row;
    private int column;

    public TurtlePosition(int row, int column ) {
        this.row = row;
        this.column = column;

    }
    public int getRow() {
        return row;

    }

    public int getColumn() {
        return column;

    }

    @Override
    public boolean equals (Object input) {
        TurtlePosition compared = (TurtlePosition) input;
        if (row == compared.getRow() && column == compared.getColumn())
            return true;
        return false;

    }
    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ",column" + column +
                '}';
    }
    public  void setColumn(int numOfSteps) {
        this.column = numOfSteps;
    }
}
