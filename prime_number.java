import java.util.Scanner;  // Import Scanner class for user input

// Class to check if a number is prime
public class prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        // Prompt user to enter a number
        System.out.println("Enter number:");
        int number = sc.nextInt();  // Read the number from user

        int count = 0;  // Counter to count the number of divisors

        // Loop from 1 to the given number
        for(int i = 1; i <= number; i++) {
            // Check if i is a divisor of number
            if(number % i == 0) {
                count++;  // Increment the divisor count
            }
        }

        // If the number has exactly 2 divisors (1 and itself), it is prime
        if(count == 2) {
            System.out.println("A Prime Number: " + number);
        } else {
            System.out.println("Not a Prime Number: " + number);
        }
    }
}
