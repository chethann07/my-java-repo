package loops;

// Write a program to print all the two digit numbers
import java.util.Scanner;

public class TwoDigitNumber {

    // this program prints all the numbers less than 100
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 10; i <= 99; i++)
            System.out.println(i);
        scan.close();
    }
}
