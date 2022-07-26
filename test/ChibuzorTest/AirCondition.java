package ChibuzorTest;

public class AirCondition {

    private boolean isOff;
    private boolean isOn;
    private int temperature;

    public boolean isOff() {
        return isOff;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = true;
    }

    public int getIncreaseTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature >= 16 && temperature < 27);
            temperature = temperature +16;
    }

    public void decreaseTemperature() {
        if (temperature > 27);
        temperature = temperature -27;
    }

    public int getDecreaseTemperature() {
        return temperature;
    }
}
