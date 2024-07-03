package strings;

// Given a string, write a program to reverse the string
import java.util.Scanner;

public class ReverseString {

    public static void reverseTheString(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            t = t + s.charAt(i);
        }
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * hello world
     * Output:
     * dlrow olleh
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        reverseTheString(s);
        scan.close();
    }
}
