import java.util.Scanner;  // Importing Scanner class to take user input

// Class to count vowels and consonants in a string
public class count_vowels {

    // Method to count vowels and consonants
    static void vowel(String a){
        int vowel_count = 0;      // Variable to count vowels
        int constant_count = 0;   // Variable to count consonants

        // Loop through each character in the string
        for(int i = 0; i < a.length(); i++){   
            char ch = a.charAt(i);  // Get character at position i

            // Check if the character is a vowel (both lowercase and uppercase)
            if((ch == 'a' || ch == 'A') || 
               (ch == 'e' || ch == 'E') || 
               (ch == 'i' || ch == 'I') || 
               (ch == 'o' || ch == 'O') || 
               (ch == 'u' || ch == 'U')) {
                vowel_count++;  // Increment vowel count
            }
            else {
                constant_count++;  // Increment consonant count (includes digits and symbols too)
            }
        }

        // Display the results
        System.out.println("Number of vowels is " + vowel_count);
        System.out.println("Number of consonants is " + constant_count);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object for input
        System.out.println("Enter String:");  // Prompting user for input
        String x = sc.next();  // Reading the input string (up to first space only)

        vowel(x);  // Calling the vowel method
    }
}
