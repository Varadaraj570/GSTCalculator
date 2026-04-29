📖 Problem Statement
Develop a Java-based GST Calculator that calculates the Goods and Services Tax for products or services based on the original price and GST rate, and displays the final price including tax using appropriate classes, constructors, and methods.

💡 What is GST?
GST (Goods and Services Tax) is an indirect tax levied on the supply of goods and services in India. It replaced multiple cascading taxes and is collected at each stage of the supply chain.

Formula:

GST Amount  = (Original Price × GST Rate) / 100
Final Price = Original Price + GST Amount
Common GST Slabs in India
Slab	Applied On
0%	Essential items (milk, vegetables, etc.)
5%	Essential medicines, toothpaste, etc.
12%	Processed food, restaurant food
18%	Electronics, software, services
28%	Luxury goods, cars, tobacco
🏗️ Project Structure
GSTCalculator/
├── src/
│   ├── Product.java         → Model class
│   ├── GSTCalculator.java   → Logic/Calculator class
│   └── Main.java            → Main entry point
└── README.md
🧠 OOP Concepts Used
Concept	Where Applied
Class	Product, GSTCalculator, Main
Constructor	Product(String name, double price, double gstRate)
Encapsulation	Private fields with public getters & setters in Product
Methods	calculateGST(), calculateFinalPrice(), displayGSTDetails()
Method Overloading	Two versions of calculateFinalPrice()
Object Creation	new Product(...), new GSTCalculator()
Arrays of Objects	Demo products stored in Product[] array
📂 Class Descriptions
1. Product.java
Represents a product or service with:

name – Name of the product/service
originalPrice – Base price before tax
gstRate – GST percentage applicable
2. GSTCalculator.java
Contains the core business logic:

calculateGST(price, rate) – Returns the GST amount
calculateFinalPrice(price, rate) – Returns price after adding GST
calculateFinalPrice(Product) – Overloaded method using Product object
displayGSTDetails(Product) – Prints full formatted breakdown
3. Main.java
Accepts user input (product name, price, GST rate)
Creates Product and GSTCalculator objects
Displays the GST breakdown
Runs a demo with 4 common GST slab examples
▶️ Sample Output
========================================
        JAVA GST CALCULATOR             
========================================
Enter product/service name: Colgate
Enter original price (Rs.): 80
Enter GST rate (%): 5

========================================
         GST CALCULATOR DETAILS         
========================================
Product/Service   : Colgate
Original Price    : Rs. 80.00
GST Rate          : 5.00%
GST Amount        : Rs. 4.00
----------------------------------------
Final Price (incl. GST): Rs. 84.00
========================================
⚙️ How to Run
Prerequisites
Java JDK 17 or above
VS Code with Extension Pack for Java
Steps
bash
# Step 1: Clone the repository
git clone https://github.com/YOUR_USERNAME/GSTCalculator.git

# Step 2: Navigate to project folder
cd GSTCalculator

# Step 3: Compile
javac -d out src/*.java

# Step 4: Run
java -cp out Main
🚀 How to Push to GitHub
bash
git init
git add .
git commit -m "Initial commit: Java GST Calculator"
git remote add origin https://github.com/YOUR_USERNAME/GSTCalculator.git
git branch -M main
git push -u origin main
📚 Learning Outcomes
Understood how to design Java classes with constructors and methods
Applied encapsulation using private fields and getters/setters
Practiced method overloading in Java
Learned to take user input using Scanner
Implemented a real-world tax calculation logic in Java
👨‍💻 Author
VARADARAJ
Roll No: 4AL23CS177
Department of Computer Science & Engineering
