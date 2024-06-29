package loops;

// Given two integers n and m, your task is to compute the sum of all the multiples of m that are less than n
import java.util.Scanner;

public class SumOfMultiples {

    public static void printSumOfMultiples(int n, int m) {
        int sum = 0;
        System.out.println("The sum is :");
        for (int i = 1; i < n; i++) {
            if (i % m == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    /*
     * Input:
     * Enter the value of n
     * 15
     * Enter the value of m
     * 4
     * Output:
     * The sum is :
     * 24
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        System.out.println("Enter the value of m");
        int m = scan.nextInt();
        printSumOfMultiples(n, m);
        scan.close();
    }
}
