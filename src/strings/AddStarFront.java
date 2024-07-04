package strings;

// Write a program to add a star infront of a
import java.util.Scanner;

public class AddStarFront {

    public static void addStar(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                t = t + "*" + ch;
            } else {
                t = t + ch;
            }
        }
        System.out.println("The altered string is :");
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * banana
     * Output:
     * The altered string is :
     * b*an*an*a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        addStar(s);
        scan.close();
    }
}
