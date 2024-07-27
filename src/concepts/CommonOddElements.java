package concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonOddElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            int number = scan.nextInt();
            a1.add(number);
        }

        for (int i = 0; i < b; i++) {
            int number = scan.nextInt();
            a2.add(number);
        }

        a1.retainAll(a2);
        boolean found = false;
        for (int number : a1) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No common elements");
        }
        scan.close();
    }
}
