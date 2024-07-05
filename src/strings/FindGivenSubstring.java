package strings;

// Write a program to find whether the substring is present or not
import java.util.Scanner;

public class FindGivenSubstring {

    public static int subString(String s, String k) {
        int size = k.length();
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t = t + s.charAt(j);
            }
            if (t.equals(k)) {
                return 1;
            }
        }
        return -1;
    }

    /*
     * Input:
     * Enter the string :
     * mississippi
     * Enter the substring to be found :
     * issi
     * Output:
     * String found
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the substring to be found :");
        String k = scan.nextLine();
        int res = subString(s, k);
        if (res == 1) {
            System.out.println("String found");
        } else {
            System.out.println("String not found");
        }
        scan.close();
    }
}
