package lab1;

//Base class
class Arithmetic {
 // Method to add two numbers
 public int add(int a, int b) {
     return a + b;
 }
 
 // Method to subtract two numbers
 public int subtract(int a, int b) {
     return a - b;
 }
}

//Derived class for Addition
class Addition extends Arithmetic {
 // Method to perform addition
 public void performAddition(int a, int b) {
     int result = add(a, b);
     System.out.println("Addition: " + a + " + " + b + " = " + result);
 }
}

//Derived class for Subtraction
class Subtraction extends Arithmetic {
 // Method to perform subtraction
 public void performSubtraction(int a, int b) {
     int result = subtract(a, b);
     System.out.println("Subtraction: " + a + " - " + b + " = " + result);
 }
}

//Main class to test the operations
public class Main {
 public static void main(String[] args) {
     // Create instances of the derived classes
     Addition add = new Addition();
     Subtraction sub = new Subtraction();
     
     // Perform addition
     add.performAddition(25, 5);
     
     // Perform subtraction
     sub.performSubtraction(10, 5);
 }
}
