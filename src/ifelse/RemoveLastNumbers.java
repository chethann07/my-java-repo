package ifelse;

// Write a program to remove the last numbers
import java.util.Scanner;

// This program removes the last numbers
public class RemoveLastNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of digits");
        int n = scan.nextInt();

        System.out.println("Enter the number");
        int num = scan.nextInt();
        // if the user wants only the first two numbers to be displayed
        int res = (int) (num / Math.pow(10, (n - 2)));
        System.out.println(res);
        scan.close();
    }
}
