package Turtle;

public class SketchPad {
    private int [][] floor;

    public  SketchPad(int length, int breadth) {

     floor = new int[length][breadth];
    }
    public int [][] getFloor() {
        return floor;
    }
}
