package Chapter7;

public class PriceControl {
    public int calculatePrice(int quantity, int amount) {
        int price = quantity * amount;
        return price;

    }

    public int grandTotal(int total, int amount){
        int price = total * amount;
        return price;
    }

    public int heartRate(int heartBeat, int age) {
        int maximumHeartRate = heartBeat - age;
        return maximumHeartRate;
    }
}
