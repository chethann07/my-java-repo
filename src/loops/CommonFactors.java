package loops;

import java.util.Scanner;

// Given an integer value m and n, write a program to print the common factors of m and n
public class CommonFactors {

    public static void factorsOfN(int m, int n) {
        System.out.println("The common factors of m and n are : ");
        for (int i = 1; i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /*
     * this program prints the common factors of m and n
     * Input:
     * Enter the value of m :
     * 12
     * Enter the value of n :
     * 18
     * Output:
     * The common factors of m and n are :
     * 1 2 3 6
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of m :");
        int m = scan.nextInt();
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        factorsOfN(m, n);
        scan.close();
    }
}
