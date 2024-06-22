package ifelse;

// Write a program to check wheather the last number is divisible by 3 or not
import java.util.Scanner;

public class LastNumDivisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number of digits");
        // int n = scan.nextInt();
        System.out.println("Enter the number");
        int num = scan.nextInt();
        // int last = (int) (num % (Math.pow(10, (n - 1))));
        int last = num % 10;
        if (last % 3 == 0) {
            System.out.println("The last number is divisible by 3");
        } else {
            System.out.println("The last number is not divisible by 3");
        }
        scan.close();
    }
}
