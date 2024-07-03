package strings;

// Write a program to trim all the spaces at the starting and ending and also at the middle if present
import java.util.Scanner;

public class TrimString {
    public static void trimSpace(String s) {
        int si = 0, ei = 0;
        String t = "";
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != ' ') {
                si = k;
                break;
            }
        }
        for (int k = s.length() - 1; k >= 0; k--) {
            if (s.charAt(k) != ' ') {
                ei = k;
                break;
            }
        }
        for (int k = si; k <= ei; k++) {

            if ((s.charAt(k) != ' ') || (s.charAt(k) == ' ' && s.charAt(k + 1) != ' ')) {
                t = t + s.charAt(k);
            }

        }

        System.out.println("The string after trim :");
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * _____________hello__________world__________
     * Output:
     * The string after trim :
     * hello_world
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        trimSpace(s);
        scan.close();
    }
}
