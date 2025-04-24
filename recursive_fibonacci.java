import java.util.Scanner;  // Import Scanner class for user input

// Class to compute Fibonacci number using recursion
public class recursive_fibonacci {

    // Recursive method to calculate the nth Fibonacci number
    static int fibonacci(int num){
        // Base cases: if num is 0 or 1, return num
        if(num <= 1){
            return num;
        }

        // Recursive case: sum of the two preceding numbers
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        System.out.println("Enter number:");  // Prompt user for input
        int num = sc.nextInt();  // Read the number from user

        // Call the recursive function and print the result
        System.out.println("Fibonacci number at position " + num + " is: " + fibonacci(num));
    }
}
