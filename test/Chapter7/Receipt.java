package Chapter7;

public class Receipt {
    public double getPriceTrouser;
    public double getPriceShirt;
    public double getPriceShoe;
    private double priceShoe;
    private double priceShirt;
    private double priceTrouser;
    public double getPrice;
    private double price;


    public Receipt(double priceTrouser, double priceShirt, double priceShoe) {
        this.priceTrouser = priceTrouser;
        this.priceShirt = priceShirt;
        this.priceShoe = priceShoe;
    }
    public void setPriceTrouser(double priceTrouser) {
        this.priceTrouser = priceTrouser;
    }
    public void setPriceShirt(double priceShirt) {
        this.priceShirt = priceShirt;
    }
    public void setPriceShoe(double priceShoe) {
        this.priceShoe = priceShoe;
    }

    public void setDiscount(double discount) {
        discount = 2/100 * price;

        this.price = discount - price;
    }

}

