package loops;

import java.util.Scanner;

// Given an integer value n, write a program to print all the factors of n
public class FactorsOfNum {

    public static void factorsOfN(int n) {
        System.out.println("The factors of n are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        factorsOfN(n);
        scan.close();
    }
}
