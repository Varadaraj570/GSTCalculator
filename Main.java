// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GSTCalculator calculator = new GSTCalculator();

        System.out.println("========================================");
        System.out.println("        JAVA GST CALCULATOR             ");
        System.out.println("========================================");

        // Take user input
        System.out.print("Enter product/service name: ");
        String name = scanner.nextLine();

        System.out.print("Enter original price (Rs.): ");
        double price = scanner.nextDouble();

        System.out.print("Enter GST rate (%): ");
        double gstRate = scanner.nextDouble();

        // Create Product object
        Product product = new Product(name, price, gstRate);

        // Display GST details
        System.out.println();
        calculator.displayGSTDetails(product);

        

        scanner.close();
    }
}
