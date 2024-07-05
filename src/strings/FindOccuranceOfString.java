package strings;

// Write a program to print the occurance of substring
import java.util.Scanner;

public class FindOccuranceOfString {

    public static int subString(String s, String k) {
        int size = k.length();
        int count = 0;
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t = t + s.charAt(j);
            }
            if (t.equals(k)) {
                count++;
            }
        }
        return count;
    }

    /*
     * Input:
     * Enter the string :
     * mississippi
     * Enter the substring to be found :
     * issi
     * Output:
     * The number of occurances of the given string is :2
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the substring to be found :");
        String k = scan.nextLine();
        int count = subString(s, k);
        if (count == 0) {
            System.out.println("String not found");
        } else {
            System.out.println("The number of occurances of the given string is :" + count);
        }
        scan.close();
    }
}
