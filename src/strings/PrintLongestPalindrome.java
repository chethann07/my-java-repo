package strings;

// Write a program to print the longest palindromic substring
import java.util.Scanner;

public class PrintLongestPalindrome {

    public static boolean isPalindrome(String t) {
        int i = 0, j = t.length() - 1;
        while (i < j) {
            if (t.charAt(i) == t.charAt(j)) {
                j--;
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void subString(String s) {
        for (int size = s.length(); size >= 1; size--) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    t = t + s.charAt(j);
                }
                if (isPalindrome(t)) {
                    System.out.println(t);
                    return;
                }
            }
        }
    }

    /*
     * Input:
     * Enter the string :
     * mississippi
     * Output:
     * The longest palindromic substring :
     * ississi
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The longest palindromic substring :");
        subString(s);
        scan.close();
    }
}
