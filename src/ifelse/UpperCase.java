package ifelse;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter = scan.next().charAt(0);
        int m = letter;
        System.out.println(m);
        if (letter >= 65 && letter <= 90) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("Enter the number");
        int n = scan.nextInt();
        char c = (char) n;
        System.out.println(c);
        scan.close();
    }
}
