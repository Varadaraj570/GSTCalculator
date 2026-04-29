// GSTCalculator.java
public class GSTCalculator {

    // Method to calculate GST amount
    public double calculateGST(double originalPrice, double gstRate) {
        return (originalPrice * gstRate) / 100;
    }

    // Method to calculate final price including GST
    public double calculateFinalPrice(double originalPrice, double gstRate) {
        double gstAmount = calculateGST(originalPrice, gstRate);
        return originalPrice + gstAmount;
    }

    // Method to calculate using a Product object
    public double calculateFinalPrice(Product product) {
        return calculateFinalPrice(product.getOriginalPrice(), product.getGstRate());
    }

    // Method to display full GST breakdown
    public void displayGSTDetails(Product product) {
        double gstAmount = calculateGST(product.getOriginalPrice(), product.getGstRate());
        double finalPrice = calculateFinalPrice(product.getOriginalPrice(), product.getGstRate());

        System.out.println("========================================");
        System.out.println("         GST CALCULATOR DETAILS         ");
        System.out.println("========================================");
        System.out.printf("Product/Service   : %s%n", product.getName());
        System.out.printf("Original Price    : Rs. %.2f%n", product.getOriginalPrice());
        System.out.printf("GST Rate          : %.2f%%%n", product.getGstRate());
        System.out.printf("GST Amount        : Rs. %.2f%n", gstAmount);
        System.out.println("----------------------------------------");
        System.out.printf("Final Price (incl. GST): Rs. %.2f%n", finalPrice);
        System.out.println("========================================");
    }
}
