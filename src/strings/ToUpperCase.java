package strings;

// Write a program to convert a string to uppercase
import java.util.Scanner;

public class ToUpperCase {

    public static void toLower(String s) {
        String t = "";
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch >= 'a' && ch <= 'z') {
                t = t + (char) (ch - 32);
            } else {
                t = t + ch;
            }
        }
        System.out.println("The uppercase string is :");
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * hellO
     * Output:
     * The uppercase string is :
     * HELLO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        toLower(s);
        scan.close();
    }
}
