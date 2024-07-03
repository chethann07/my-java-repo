package strings;

// Write a program to remove the special charecter from string
import java.util.Scanner;

public class RemoveSpecialCharecter {

    public static void countAll(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                t = t + s.charAt(i);
            }
        }
        System.out.println("The new string : " + t);

    }

    /*
     * Input:
     * Enter the string :
     * he##o
     * Output:
     * The new string : heo
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        countAll(s);
        scan.close();
    }
}
