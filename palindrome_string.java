
import java.util.Scanner;

public class palindrome_string{
    static String palindrome(String a){
        String rev = "";   // store reverse string
        for(int i = a.length()-1; i>=0; i--){  // use loop from length-1 of a to 0.
            rev = rev+a.charAt(i); // store single character.
        }
        return rev; // return reverse string.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next(); // take input.
        String org_str = str; // store input in org_str.
        String rev_str = palindrome(str);  // store return rev string in rev_str
        if(org_str.equals(rev_str)){  // check both strings.
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}