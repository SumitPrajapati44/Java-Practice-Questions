import java.util.Scanner;  // Import Scanner class for user input

// Class to find the sum of first 'n' natural numbers using recursion
public class sum_recursive {

    // Recursive method to calculate sum of first n numbers
    static int sum(int n){
        // Base case: if n is 1, return 1
        if(n == 1)
            return 1;
        else
            // Recursive step: n + sum of numbers before it
            return n + sum(n - 1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        // Prompt the user to enter a number
        System.out.println("Enter number:");
        int num = sc.nextInt();  // Read the input

        // Call the recursive method and print the result
        System.out.println("Sum of first " + num + " numbers is: " + sum(num));
    }
}
