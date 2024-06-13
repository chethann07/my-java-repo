package ifelse;

import java.util.Scanner;

public class EndsWithTwoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        // This method checks wheather the number ends with seven or not another way is
        // to check for (n+3)%10 == 0
        if (n % 100 == 23) {
            System.out.println("The number ends with 23");
        } else {
            System.out.println("The number doesnt ends with 23");
        }
        scan.close();
    }
}
