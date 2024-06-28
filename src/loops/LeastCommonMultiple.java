package loops;

// Given the values of n, a and b print all the multiples of a and b less than n
import java.util.Scanner;

public class LeastCommonMultiple {

    public static void printMultiples(int a, int b) {
        System.out.println("The multiples of " + a + "and " + b + "are :");
        for (int i = 1; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i + " ");
                return;
            }
        }
    }

    // this program prints all the multiples of a and b less than n
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the value of n :");
        // int n = scan.nextInt();
        System.out.println("Enter the value of a :");
        int a = scan.nextInt();
        System.out.println("Enter the value of b :");
        int b = scan.nextInt();
        printMultiples(a, b);
        scan.close();
    }
}
