package strings;

// Write a program to find the index of a charecter k in a string
import java.util.Scanner;

public class FindSubString {

    public static void subString(String s, String k) {
        int i = 0, j = 0;
        while (i < s.length() && j < k.length()) {
            if (k.charAt(j) == s.charAt(i)) {
                j++;
                i++;
            } else {
                i++;
            }
        }
        if (j == k.length()) {
            System.out.println("String found");
        } else {
            System.out.println("String not found");
        }
    }

    /*
     * Input:
     * Enter the string :
     * hereiamstackerrank
     * Enter the string to be found :
     * hackerrank
     * Output:
     * String found
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the string to be found :");
        String k = scan.nextLine();
        subString(s, k);
        scan.close();
    }
}
