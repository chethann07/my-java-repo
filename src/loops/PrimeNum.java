package loops;

import java.util.Scanner;

// Given an integer value n, write a program to print wheather a number is prime or not
public class PrimeNum {
    public static String checkPrime(int n) {
        @SuppressWarnings("unused")
        // The first factor of any number excluding 1 will lie with in root(n)
        // i.e, i <= root(n) => square(i) <= square(root(n)) => i * i <= n
        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "The number is not prime";
            }
        }
        return "The number is prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        String res = checkPrime(n);
        System.out.println(res);
        scan.close();
    }
}
