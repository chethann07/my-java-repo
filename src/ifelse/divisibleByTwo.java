package ifelse;

import java.util.Scanner;

public class divisibleByTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n % 2 == 0) {
            System.out.println("Divisible by 2");
        } else {
            System.out.println("Not divisible by 2");
        }
        scan.close();
    }
}
