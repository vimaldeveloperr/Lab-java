package lab;

import java.util.Scanner;

public class ArmstrongNumbers {

    // Method to print Armstrong numbers within a given range
    public static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.println(num);
            }
        }
    }

    // Helper method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        
        // Calculate the sum of cubes of digits manually
        while (number > 0) {
            int digit = number % 10;
            int cube = digit * digit * digit;  // Cube of the digit
            sum += cube;
            number /= 10;
        }
        
        // Return true if the sum of cubes equals the original number
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Printing Armstrong numbers 
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        printArmstrongNumber(start, end);

        // Close the scanner
        scanner.close();
    }
}
