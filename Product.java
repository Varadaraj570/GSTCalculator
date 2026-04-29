// Product.java
public class Product {
    private String name;
    private double originalPrice;
    private double gstRate; // GST rate in percentage (e.g., 18 for 18%)

    // Constructor
    public Product(String name, double originalPrice, double gstRate) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.gstRate = gstRate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public double getGstRate() {
        return gstRate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public void setGstRate(double gstRate) {
        this.gstRate = gstRate;
    }
}