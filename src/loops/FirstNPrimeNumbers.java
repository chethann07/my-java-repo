package loops;

// Given an integer value n, write a program to print the first n prime numbers
import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static boolean checkPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printNPrimeNum(int n) {
        /*
         * int count = 1;
         * int i = 2;
         * while (count < n) {
         * if (checkPrime(i)) {
         * System.out.print(i + " ");
         * count++;
         * }
         * i++;
         * }
         */

        int count = 0;
        System.out.println("The first " + n + " prime numbers are :");
        for (int i = 2; count < n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    /*
     * this program prints the first n prime numbers
     * Input:
     * Enter the value of n
     * 10
     * Output:
     * The first 10 prime numbers are :
     * 2 3 5 7 11 13 17 19 23 29
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        printNPrimeNum(n);
        scan.close();
    }
}
