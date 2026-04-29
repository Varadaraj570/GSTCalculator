
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GSTCalculator calculator = new GSTCalculator();

        System.out.println("========================================");
        System.out.println("        JAVA GST CALCULATOR             ");
        System.out.println("========================================");

     
        System.out.print("Enter product/service name: ");
        String name = scanner.nextLine();

        System.out.print("Enter original price (Rs.): ");
        double price = scanner.nextDouble();

        System.out.print("Enter GST rate (%): ");
        double gstRate = scanner.nextDouble();

       
        Product product = new Product(name, price, gstRate);

 
        System.out.println();
        calculator.displayGSTDetails(product);

        

        scanner.close();
    }
}
