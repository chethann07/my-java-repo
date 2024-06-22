package ifelse;

// Write a program to check wheather the number ends with two numbers or not
import java.util.Scanner;

// This program checks wheather the number ends with two numbers or not
public class EndsWithTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if (n % 100 == 23) {
            System.out.println("The number ends with 23");
        } else {
            System.out.println("The number doesnt ends with 23");
        }
        scan.close();
    }
}
