package strings;

// Write a program to count the number of vowels in a string
import java.util.Scanner;

public class CountVowel {

    public static int countVowel(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    /*
     * Input:
     * Enter the string :
     * hello world
     * Output:
     * The number of vowels are : 3
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("The number of vowels are : " + countVowel(s));
        scan.close();
    }
}
