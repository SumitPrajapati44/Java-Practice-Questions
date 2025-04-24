import java.util.Scanner;  // Import Scanner for user input

// Class to reverse a string using recursion
public class str_rev_recursion {

    // Recursive method to reverse a string
    static String rev_str(String s){
        // Base case: if string is null or has 0 or 1 character, return it as is
        if(s == null || s.length() <= 1){
            return s;
        }
        // Recursive step: reverse the substring from index 1 to end, then add the first character to the end
        else
            return rev_str(s.substring(1)) + s.charAt(0);
    }

    // Main method - program starts here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        System.out.println("Enter String:");  // Prompt the user to enter a string
        String str = sc.next();  // Read input string (only till first space)

        // Call the recursive method and print the reversed string
        System.out.println("Reverse string is: " + rev_str(str));
    }
}
