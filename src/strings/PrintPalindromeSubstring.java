package strings;

// Write a program to print the palindromic substrings
import java.util.Scanner;

public class PrintPalindromeSubstring {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void subString(String s, int size) {
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t = t + s.charAt(j);
            }
            if (isPalindrome(t)) {
                System.out.println(t);
            }
        }
    }

    /*
     * Input:
     * Enter the string :
     * mississippi
     * Enter the length of substring :
     * 4
     * Output:
     * TThe palindromic substrings are :
     * issi
     * issi
     * ippi
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the length of substring :");
        int size = scan.nextInt();
        System.out.println("The palindromic substrings are :");
        subString(s, size);
        scan.close();
    }
}
