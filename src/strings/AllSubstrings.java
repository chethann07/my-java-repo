package strings;

// Write a program to print all the substrings
import java.util.Scanner;

public class AllSubstrings {

    public static void subString(String s) {
        int size = 1;
        while (size <= s.length()) {
            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < i + size; j++) {
                    t = t + s.charAt(j);
                }
                System.out.println(t);
            }
            size++;
        }
    }

    /*
     * Input:
     * Enter the string :
     * hello
     * Output:
     * The substrings are :
     * h
     * e
     * l
     * l
     * o
     * he
     * el
     * ll
     * lo
     * hel
     * ell
     * llo
     * hell
     * ello
     * hello
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The substrings are :");
        subString(s);
        scan.close();
    }
}
