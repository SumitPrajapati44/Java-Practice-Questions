// Importing Scanner class for user input
import java.util.Scanner;

// Main class definition
public class palindrome {
    static int drome(int n){     // Main class definition
        int rev_num = 0;        // Variable to store the reversed number
        while(n!=0){            // Loop until n becomes 0
            int last = n%10;      // Extracting the last digit
            rev_num = rev_num*10 + last;   // Building the reversed number
            n/=10;           // Removing the last digit
        }
        return rev_num;     // Returning the reversed number
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter number");
        int original = sc.nextInt();

        int palindrome = drome(original);       // Calling method to reverse the number

        // Checking if original and reversed numbers are equal
        if(original == palindrome)
        System.err.println("It is a palindrome number:"+original);
        else
        System.err.println("It is not a palindrome number:"+original + "and" +palindrome);
    }
    
}
