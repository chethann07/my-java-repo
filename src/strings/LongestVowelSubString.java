package strings;

import java.util.Scanner;

public class LongestVowelSubString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The substrings are :");
        subString(s);
        scan.close();
    }

    public static void subString(String s) {
        int size = 1;
        int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;
        while (size <= s.length()) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    t = t + s.charAt(j);
                }

                for (int k = 0; k < t.length(); k++) {
                    char ch = t.charAt(k);
                    if (ch == 'a' || ch == 'A') {
                        counta++;
                    }
                    if (ch == 'e' || ch == 'E') {
                        counte++;
                    }
                    if (ch == 'i' || ch == 'I') {
                        counti++;
                    }
                    if (ch == 'o' || ch == 'O') {
                        counto++;
                    }
                    if (ch == 'u' || ch == 'U') {
                        countu++;
                    }
                }

            }
            if (counta > 0 && counte > 0 && counti > 0 && counto > 0 && countu > 0) {
                System.out.println();
            } else {
                System.out.println("None");
            }
            size++;
        }

    }

}
