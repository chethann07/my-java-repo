package ifelse;

// Write a program to check wheather the number is divisible by 3 and 5
import java.util.Scanner;

// This program checks wheather the number is divisible by 3 and 5
public class divisibleByTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5");
        } else {
            System.out.println("The number is not 14divisible by 3 and 5");
        }
        scan.close();
    }
}
