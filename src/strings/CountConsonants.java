package strings;

// Write a program to count the number of consonants in a string

import java.util.Scanner;

public class CountConsonants {
    public static int countConsonant(String s) {
        int cc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                        || ch == 'I'
                        || ch == 'O' || ch == 'U')) {
                    cc++;
                }
            }
        }
        return cc;
    }

    /*
     * Input:
     * Enter the string :
     * hello world123@#45
     * Output:
     * The number of consonants are : 7
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The number of consonants are : " + countConsonant(s));
        scan.close();
    }
}