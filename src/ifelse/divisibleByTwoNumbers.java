package ifelse;

import java.util.Scanner;

public class divisibleByTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        // This program checks wheather the number is divisible by 3 and 5 or not
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5");
        } else {
            System.out.println("The number is not 14divisible by 3 and 5");
        }
        scan.close();
    }
}
