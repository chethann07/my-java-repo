package strings;

// Write a program to add the given value to the string and display it
import java.util.Scanner;

public class SimpleEncryption {

    public static void addNumToString(String s, int k) {
        String t = "";
        k = k % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (((ch + k) >= 97 && (ch + k) <= 122) || ((ch + k) >= 'A' && (ch + k) <= 'Z')) {
                    t = t + (char) (ch + k);
                } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    t = t + (char) (ch + k - 26);
                }
            } else {
                t = t + ch;
            }
        }
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * abc_xyz
     * Enter the number which should be added :
     * 3
     * Output:
     * The resultant string :
     * def_abc
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the number which should be added :");
        int k = scan.nextInt();
        System.out.println("The resultant string :");
        addNumToString(s, k);
        scan.close();
    }
}
