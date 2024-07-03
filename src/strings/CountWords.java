package strings;

// Write a program to print the number of words in a string
import java.util.Scanner;

public class CountWords {

    public static int countWord(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return s.charAt(0) == ' ' ? count : count + 1;
    }

    /*
     * Input:
     * Enter the string :
     * hello world
     * Output:
     * The number of words are : 2
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The number of words are : " + countWord(s));
        scan.close();
    }
}
