package lab;

import java.util.Scanner;

public class StudentMarkList {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for subject 3: ");
        int subject3 = scanner.nextInt();

        // Calculate total and average
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        // Display the marks and total
        System.out.println("\nMark List for " + name);
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        // Determine grade and pass/fail status
        String grade;
        String result;

        if (average >= 90) {
            grade = "A";
            result = "Pass";
        } else if (average >= 80) {
            grade = "B";
            result = "Pass";
        } else if (average >= 70) {
            grade = "C";
            result = "Pass";
        } else if (average >= 60) {
            grade = "D";
            result = "Pass";
        } else {
            grade = "F";
            result = "Fail";
        }

        // Display the grade and pass/fail status
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}

