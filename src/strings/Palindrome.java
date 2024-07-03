package strings;

// Given a string find whether a string is palindrome or not
import java.util.Scanner;

public class Palindrome {
    // Another way to find out whether a string is palindrome or not

    public static String palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return "Not a palindrome";
            }
        }
        return "Palindrome";
    }

    public static void palindrome2(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        if (s.equals(t)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    /*
     * Input:
     * Enter the string :
     * tenet
     * Output:
     * Palindrome
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println(palindrome(s));
        scan.close();
    }
}
