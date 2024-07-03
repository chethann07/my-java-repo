package strings;

// Write a program to count the number of spaces
import java.util.Scanner;

public class CountSpaces {
    public static int countSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }

    /*
     * Input:
     * Enter the string :
     * hello world, how are you?
     * Output:
     * The number of spaces are : 4
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The number of spaces are : " + countSpace(s));
        scan.close();
    }

}
