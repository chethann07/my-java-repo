package loops;

// Given a number n, print the multiplication table of n till 10
import java.util.Scanner;

public class MultiplicationOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scan.nextInt();
        System.out.println("The multiplication table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        scan.close();
    }
}
