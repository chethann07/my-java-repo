package concepts;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        ArrayList<Integer> a1 = new ArrayList<>(a);
        ArrayList<Integer> a2 = new ArrayList<>(b);
        ArrayList<Integer> a3 = new ArrayList<>(c);

        for (int i = 0; i < a; i++) {
            int number = scan.nextInt();
            a1.add(number);
        }

        for (int i = 0; i < b; i++) {
            int number = scan.nextInt();
            a2.add(number);
        }

        for (int i = 0; i < c; i++) {
            int number = scan.nextInt();
            a3.add(number);
        }
        a2.retainAll(a3);
        a1.retainAll(a2);

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        scan.close();

    }
}
