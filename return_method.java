import java.util.Scanner;  // Importing Scanner class to take user input

// Class to demonstrate use of a return method for string length
public class return_method {

    // Method that returns the length of the given string
    static int length(String a){
        return a.length();  // Using String's built-in length() method
    }

    // Main method - program entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for input

        // Prompt user to enter a string
        System.out.println("Enter String");
        String x = sc.nextLine();  // Read input string

        // Call the method and print the length of the string
        System.out.println("Length of the string is " + length(x));
    }
}
