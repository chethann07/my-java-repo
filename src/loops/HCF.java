package loops;

import java.util.Scanner;

// Given an integer value m and n, write a program to print the highest common factor
public class HCF {

    public static void highestCommonFactor(int m, int n) {
        System.out.println("The highest common factor of m and n is : ");
        int min = m < n ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.print(i + " ");
                break;
            }
        }
    }

    public static int euclidsAlgorithm(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }

    /*
     * this program prints the common factors of m and n
     * Input:
     * Enter the value of m :
     * 18
     * Enter the value of n :
     * 12
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
        int res = euclidsAlgorithm(m, n);
        System.out.println("The highest common factor of m and n is : ");
        System.out.println(res);
        scan.close();
    }
}
