import java.util.Scanner;  // Import Scanner class for user input

// Class to calculate the sum of digits of a given number
public class sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        // Prompt user to enter a number
        System.out.println("Enter number:");
        int num = sc.nextInt();  // Read the number from user

        int sum = 0;  // Variable to store the sum of digits

        // Loop to extract digits and add them to sum
        while(num != 0) {
            int digit = num % 10;  // Get the last digit
            sum = sum + digit;     // Add the digit to the sum
            num /= 10;             // Remove the last digit
        }

        // Output the result
        System.out.println("Sum of digits is: " + sum);
    }
}
