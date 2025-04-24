import java.util.Scanner;  // Importing Scanner class for taking input

// Class to compare three numbers and find the greatest
public class compare_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating Scanner object

        // Taking input for first number
        System.out.println("Enter the 1st number:");
        int num1 = sc.nextInt();

        // Taking input for second number
        System.out.println("Enter the 2nd number:");
        int num2 = sc.nextInt();

        // Taking input for third number
        System.out.println("Enter the 3rd number:");
        int num3 = sc.nextInt();

        // Comparing numbers to find the greatest
        if(num1 > num2){  // Check if num1 is greater than num2
            if(num1 > num3){  // If true, check if num1 is also greater than num3
                System.out.println("num1 is greatest: " + num1);  // num1 is the greatest
            }
            else
                System.out.println("num3 is greatest: " + num3);  // num3 is greater than num1
        }
        else{  // If num2 is greater than or equal to num1
            if(num2 > num3)  // Check if num2 is greater than num3
                System.out.println("num2 is greatest: " + num2);  // num2 is the greatest
            else
                System.out.println("num3 is greatest: " + num3);  // num3 is greater than num2
        }
    }
}
