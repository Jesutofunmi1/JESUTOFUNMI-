package PracticeMakesPerfect;

public class Test {
    private String test;
    private double itemPrice;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Test(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Test(String test) {
        this.test = test;


    }
}
