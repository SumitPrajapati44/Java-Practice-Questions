import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();  // take input from keyboard

        long fact = 1;   // it hold actual answer

        for(int i=1; i<=num; i++){    // use loop for every number 
            fact = fact*i;
        }
        System.out.println("factorial of "+num +" is " +fact);  // print answer
    }
}
