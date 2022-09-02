package tdd.Chapter3;

public class ClockTest {
    private int hours;
    private int minutes;
    private int seconds;

    public ClockTest(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }
    public void setHours(int hours) {
        if (hours >= 23) {
            this.hours = hours;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if ( minutes >= 59 ) {
            this.minutes = minutes;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 59 ) {
            this.seconds = seconds;
        }
    }
}
