package tdd.Chapter3;

public class Fan {
        private String name;
        private boolean isOn;
        private int speed = 0;

    public Fan(String name) {
        this.name = name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
            isOn =false;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed()  {
        if (speed >= 0 && speed < 3 ) {
            speed = speed + 1;
        }
        }


    public void decreaseSpeed() {
        if (speed > 0) {
            // speed = 3, speed -1=2
            // speed = 2, speed -1=1
            // speed = 1, speed -0=0
            speed = speed - 1;
        }
    }
}
