package ChibuzorTest;

public class Bike {
    private int kilometre;
    private int gearNumber;

    private boolean bikeIsOn;
    public void accelerate() {
        if(bikeIsOn){
            if (kilometre >= 0 && kilometre <= 20) {
                kilometre += 1;
                gearNumber = 1;
                if(kilometre>= 21) gearNumber = 2;
            }else if (kilometre >= 21 && kilometre <= 40) {
                kilometre += 2;
                if(kilometre>= 41) gearNumber = 3;
            }else if (kilometre >= 41 && kilometre <= 60) {
                kilometre+=3;
                if(kilometre>= 61) gearNumber = 4;
            }else if (kilometre >= 61 && kilometre <= 80) {
                kilometre+=4;
            }
        }
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void applyBreak() {
        if (gearNumber == 4) {
             kilometre -= 4;
             if(kilometre<= 60)gearNumber = 3;
        }else if (gearNumber == 3) {
            kilometre -= 3;
            if(kilometre<= 40)gearNumber = 2;
        }else if (gearNumber == 2) {
            kilometre -= 2;
            if(kilometre<= 20)gearNumber = 1;
        }else if (gearNumber == 1) {
            kilometre -= 2;
            if(kilometre<= 0)gearNumber =0;
        }
    }

    public int getKilometer() {
        return kilometre;
    }

    public boolean isOn() {
        return bikeIsOn;
    }

    public void turnOn() {
        bikeIsOn = true;
    }
}
