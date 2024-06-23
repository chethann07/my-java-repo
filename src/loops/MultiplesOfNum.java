package loops;

import java.util.Scanner;

public class MultiplesOfNum {

    public static void printMultiples(int n, int a, int b) {
        System.out.println("The multiples of " + a + "and " + b + "are :");
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 || i % b == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        System.out.println("Enter the value of a :");
        int a = scan.nextInt();
        System.out.println("Enter the value of b :");
        int b = scan.nextInt();
        printMultiples(n, a, b);
        scan.close();
    }
}
