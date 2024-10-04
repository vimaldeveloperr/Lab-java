package lab1;


//Define the Animal interface
interface Animal {
 // Abstract method for making a sound
 void sound();
 
 // Abstract method for eating
 void eat();
}

//Implement the Animal interface in the Dog class
class Dog implements Animal {
 // Provide implementation for sound() method
 public void sound() {
     System.out.println("The dog barks.");
 }
 
 // Provide implementation for eat() method
 public void eat() {
     System.out.println("The dog eats bones.");
 }
}

//Implement the Animal interface in the Cat class
class Cat implements Animal {
 // Provide implementation for sound() method
 public void sound() {
     System.out.println("The cat meows.");
 }
 
 // Provide implementation for eat() method
 public void eat() {
     System.out.println("The cat eats fish.");
 }
}

//Main class to test the interface implementation
public class InterfaceDemo {
 public static void main(String[] args) {
     // Create instances of Dog and Cat
     Animal myDog = new Dog();
     Animal myCat = new Cat();
     
     // Call methods on Dog instance
     myDog.sound();
     myDog.eat();
     
     // Call methods on Cat instance
     myCat.sound();
     myCat.eat();
 }
}
