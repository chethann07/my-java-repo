package loops;

// Given an integer value n, write a program to print the common multiples of a and b till n
import java.util.Scanner;

public class CommonMultiples {

    public static void printMultiples(int n, int a, int b) {
        System.out.println("The multiples of " + a + " and " + b + " till " + n + " are :");
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
     * this program prints the common multiples of a and b till n
     * Input:
     * Enter the value of n
     * 20
     * Enter the number a
     * 2
     * Enter the number b
     * 3
     * Output:
     * The multiples of 2 and 3 till 20 are :
     * 6 12 18
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println("Enter the number a");
        int a = scan.nextInt();
        System.out.println("Enter the number b");
        int b = scan.nextInt();
        printMultiples(n, a, b);
        scan.close();
    }
}
