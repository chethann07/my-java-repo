package strings;

// Write a program to remove the special charecter from string and add the sum of numbers at the end
import java.util.Scanner;

public class AlphaSumNumeric {

    public static void replace(String s) {
        String t = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                t = t + s.charAt(i);
            }
            if (ch >= '0' && ch <= '9') {
                sum += s.charAt(i) - 48;
            }
        }
        t = t + sum;
        System.out.println("The new string : " + t);

    }

    /*
     * Input:
     * Enter the string :
     * he7ll$#6o5
     * Output:
     * The new string : hello18
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        replace(s);
        scan.close();
    }
}
