package lab1;


//Base class
class Person {
 String name;
 int age;
 
 // Constructor
 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
 
 // Method to display person details
 void displayPersonInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Derived class
class Employee extends Person {
 String employeeId;
 
 // Constructor
 Employee(String name, int age, String employeeId) {
     super(name, age); // Call the constructor of Person
     this.employeeId = employeeId;
 }
 
 // Method to display employee details
 void displayEmployeeInfo() {
     displayPersonInfo(); // Call method from Person class
     System.out.println("Employee ID: " + employeeId);
 }
}

//Further derived class
class Manager extends Employee {
 String department;
 
 // Constructor
 Manager(String name, int age, String employeeId, String department) {
     super(name, age, employeeId); // Call the constructor of Employee
     this.department = department;
 }
 
 // Method to display manager details
 void displayManagerInfo() {
     displayEmployeeInfo(); // Call method from Employee class
     System.out.println("Department: " + department);
 }
}

//Main class to test the multilevel inheritance
public class Multilevel {
 public static void main(String[] args) {
     // Create an instance of Manager
     Manager manager = new Manager("Vimal", 21, "E12345", "cse");
     
     // Display manager details
     manager.displayManagerInfo();
 }
}

