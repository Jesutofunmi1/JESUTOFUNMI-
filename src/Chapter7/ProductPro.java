package Chapter7;

public class ProductPro {
    private String productName;
    private static int productUnit;
    private static String productNames;
    private static double pricePerUnit;

    public static void setProductName(String productName) {
        productNames = productName;
    }
    public static String getProductName() {
        return productNames;
    }
    public static void setProductUnit(int productUnit) {
        ProductPro.productUnit = productUnit;
    }
    public static int getProductUnit() {
        return productUnit;
    }
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public static double getPricePerUnit() {
        return pricePerUnit;
    }
    public static double getPriceOnEachProduct() {
        return pricePerUnit*productUnit;
    }
}
