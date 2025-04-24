
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number for calculate power:");
        int num = sc.nextInt();
        System.out.println("Enter power of a number:");
        int power = sc.nextInt();
        int result = 1;       // Variable to store the power of a number

        for(int i=1; i<power-1; i++){   // use for loop it run until power-1.
            result = result*num;    // calculate power of a number
        }
        System.out.println("power of "+num+ " is "+result);   // print result
    }
}
