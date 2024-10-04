package lab;

import java.util.Scanner;

public class OddEvenCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int number = scanner.nextInt();

            if (number == -1) {
                break; // Exit the loop if -1 is entered
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        // Close the scanner
        scanner.close();
    }
}
