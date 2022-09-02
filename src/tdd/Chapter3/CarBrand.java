package tdd.Chapter3;

public class CarBrand {
    public double getDiscount;
    private String name;
    private String year;
    private double price;
    private double amount;
    private double discount;


    public CarBrand(String name, String year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setHiluxPrice(double price) {
        this.price = price;
    }
    public void setCorollaPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        discount = (price * discount) / 100;
        return discount;
    }

}
