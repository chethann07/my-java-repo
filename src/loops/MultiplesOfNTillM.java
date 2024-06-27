package loops;

// Given an integer value n, write a program to print the multiples of n till m
import java.util.Scanner;

public class MultiplesOfNTillM {

    public static void printMultiples(int n, int m) {
        System.out.println("The multiples of " + n + " till " + m + " are :");
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
     * this program prints the multiples of n till m
     * Input:
     * Enter the value of n
     * 10
     * Enter the value of m
     * 30
     * Output:
     * The multiples of 10 till 30 are :
     * 10 20 30
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println("Enter the value of m");
        int m = scan.nextInt();
        printMultiples(n, m);
        scan.close();
    }
}
