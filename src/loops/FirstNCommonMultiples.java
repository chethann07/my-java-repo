package loops;

// Given an integer value n, write a program to print the first n common multiples of a and b
import java.util.Scanner;

public class FirstNCommonMultiples {

    public static void printMultiples(int n, int a, int b) {
        int count = 0;
        System.out.println("The first " + n + " multiples of " + a + " and " + b + " are :");
        for (int i = 1; count < n; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    /*
     * this program prints the first n common multiples of a and b
     * Input:
     * Enter the value of n
     * 5
     * Enter the number a
     * 2
     * Enter the number b
     * 3
     * Output:
     * The first 5 multiples of 2 and 3 are :
     * 6 12 18 24 30
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
