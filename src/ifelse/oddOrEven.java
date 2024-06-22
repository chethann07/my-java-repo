package ifelse;

// Write a program to check wheather a number is even or odd
import java.util.Scanner;

// This program checks wheather the number is even or odd
public class oddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        scan.close();
    }
}
