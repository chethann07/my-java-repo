package ifelse;

// Write a program to check wheather the number is divisible by 2,5 and 10
import java.util.Scanner;

// This program checks wheather the number is divisible by 2, 5 and 10 or not
// if (n % 2 == 0 && n % 5 == 0 && n % 10 == 0)
public class divisibleByThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if (n % 10 == 0) {
            System.out.println("The number is divisible by 2, 5 and 10");
        } else {
            System.out.println("The number is not 14divisible by 2, 5 and 10");
        }
        scan.close();
    }
}
