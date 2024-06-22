package ifelse;

// Write a program to check wheather the number ends with zero or not
import java.util.Scanner;

// This program checks wheather the number ends with zero or not
public class EndsWithZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        // This method checks wheather the number ends with zero or not
        if (n % 10 == 0) {
            System.out.println("The number ends with zero");
        } else {
            System.out.println("The number doesnt ends with zero");
        }
        scan.close();
    }
}
