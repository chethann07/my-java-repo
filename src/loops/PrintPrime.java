package loops;

// Given two integer value m and n, write a program to print prime numbers between m and n
import java.util.Scanner;

public class PrintPrime {
    public static boolean checkPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNum(int m, int n) {
        System.out.println("The prime numbers between " + m + " and " + n + " are :");
        for (int i = m; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    /*
     * this program prints the prime number between m and n
     * Input:
     * Enter the starting value
     * 2
     * Enter the ending value
     * 10
     * Output:
     * The prime numbers between 2 and 13 are :
     * 2 3 5 7 11 13
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting value");
        int m = scan.nextInt();
        System.out.println("Enter the ending value");
        int n = scan.nextInt();
        printPrimeNum(m, n);
        scan.close();
    }
}
