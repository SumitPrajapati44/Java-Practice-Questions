
import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        int arm = 0;   // Store Sum of result.
        Scanner sc = new Scanner(System.in);  // use for take input.
        System.out.println("Enter number");   // print message for input.
        int num = sc.nextInt();   // actual take input here.
        
        int hold = num;    // hold the input.

        while(num!=0){     // loop condition, it is run while num is not equal to 0.
          int rem =  num%10;    // use modules operator give the last number e.g:- 153 give- 3.
           arm = (rem*rem*rem)+arm;  // resulting answer multiply 3 times itself and store it.
           num = num/10;           // split the number  e.g:- 153 give- 15
        }
        if(hold == arm){     // compare resulted answer with input
            System.out.println("it is a armstrong number:" +arm);
        }
        else{
            System.out.println("it is not a armstrong number:" +arm);
        }
    }
}