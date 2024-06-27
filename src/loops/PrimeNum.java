package loops;

import java.util.Scanner;

// Given an integer value n, write a program to print wheather a number is prime or not
public class PrimeNum {
    public static String checkPrime(int n) {
        // This is another method to find wheather a number is prime or not
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println("The number is prime");
        // } else {
        // System.out.println("The number is not prime");
        // }

        /*
         * For prime number the factors will be 1 and itself and for non primes too the
         * factors like 1 and itslef will be there so in this second method we remove 1
         * and the number itself and this will leave us with prime numbers having no
         * factors and the loop to start from 2 and also we do not have to go till n
         * instead we can go till n/2:
         * int count = 0;
         * for (int i = 2; i <= n/2; i++) {
         * if (n % i == 0) {
         * count++;
         * }
         * }
         * if (count == 0) {
         * System.out.println("The number is prime");
         * } else {
         * System.out.println("The number is not prime");
         * }
         */
        // In this third method we consider that the first factor of any number
        // excluding 1 will lie with in root(n)
        // i.e, i <= root(n) => square(i) <= square(root(n)) => i * i <= n
        // As soon as there is a factor of n it means its not prime
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
