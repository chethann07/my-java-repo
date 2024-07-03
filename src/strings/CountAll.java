package strings;

// Write a program to count the number of consonants, vowels, numbers and special charecters in a string
import java.util.Scanner;

public class CountAll {

    public static void countAll(String s) {
        int cc = 0, vc = 0, nc = 0, spc = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                        || ch == 'I'
                        || ch == 'O' || ch == 'U')) {
                    cc++;
                } else {
                    vc++;
                }
            } else if (ch >= '0' && ch <= '9') {
                nc++;
            } else {
                spc++;
            }
        }
        System.out.println("The number of consonants are : " + cc);
        System.out.println("The number of vowels are : " + vc);
        System.out.println("The number of numbers are : " + nc);
        System.out.println("The number of special charecters are are : " + spc);

    }

    /*
     * Input:
     * Enter the string :
     * hello@123
     * Output:
     * The number of consonants are : 3
     * The number of vowels are : 2
     * The number of numbers are : 3
     * The number of special charecters are are : 1
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        countAll(s);
        scan.close();
    }
}
