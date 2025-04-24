import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true; // Divisible by 400 → Leap year
        } else if (year % 100 == 0) {
            isLeap = false; // Divisible by 100 but not 400 → Not a leap year
        } else if (year % 4 == 0) {
            isLeap = true; // Divisible by 4 but not 100 → Leap year
        } else {
            isLeap = false; // Otherwise, not a leap year
        }

        // Display result
        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }
}
