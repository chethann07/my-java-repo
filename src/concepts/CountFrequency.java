package concepts;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        stringCompression(s);
        scan.close();
    }

    private static void stringCompression(String s) {
        int i = 0;

        while (i < s.length()) {
            int count = 0;
            char ch = s.charAt(i);
            while (i < s.length() && ch == s.charAt(i)) {
                count++;
                i++;
            }

            System.out.print(ch + "" + count);
            // System.out.println();
        }
    }
}
