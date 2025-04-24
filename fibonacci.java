
import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Range");
        int n_term = sc.nextInt();    // take input

        for(int i = 1; i<=n_term; i++){  // use loop for range of fabonacci series which take from input.
            System.out.println(first);  // print first number.
            int last = first + second;   // add 1st and 2nd numbers.
            first = second;
            second = last;
            // swap numbers for further operations.
        }
    }
}