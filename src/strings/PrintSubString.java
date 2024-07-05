package strings;

// Write a program to find the substring of a given size
import java.util.Scanner;

public class PrintSubString {

    public static void subString(String s, int size) {
        System.out.println("The substrings are :");
        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < i + size; j++) {
                t = t + s.charAt(j);
            }
            System.out.println(t);
        }
    }

    /*
     * Input:
     * Enter the string :
     * mississippi
     * Enter the length of the substring :
     * 4
     * Output:
     * The substrings are :
     * miss
     * issi
     * ssis
     * siss
     * issi
     * ssip
     * sipp
     * ippi
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the length of the substring :");
        int size = scan.nextInt();
        subString(s, size);
        scan.close();
    }
}
