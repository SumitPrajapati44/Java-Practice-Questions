import java.util.Scanner;  // Importing Scanner class for user input

// Class to reverse a number using a custom method
public class revese{

    // Method to reverse the digits of a number
    static int rev(int n){
        int count = 0;  // Variable to store the reversed number

        // Loop until the number becomes 0
        while(n != 0){
            int r = n % 10;  // Get the last digit
            count = count * 10 + r;  // Add the digit to the reversed number
            n /= 10;  // Remove the last digit
        }

        return count;  // Return the reversed number
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for input

        System.err.println("Enter number:");  // Prompt user to enter a number
        int num = sc.nextInt();  // Read the input number

        // Display the reversed number
        System.err.println("Reverse number is: " + rev(num));

        sc.close();  // Close the scanner to prevent resource leak
    }
}
