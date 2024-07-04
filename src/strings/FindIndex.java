package strings;

// Write a program to find the index of a charecter k in a string
import java.util.Scanner;

public class FindIndex {

    public static int findKIndex(String s, char k) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == k) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Input:
     * Enter the string :
     * matrix
     * Output:
     * Enter the charecter k :
     * i
     * The index of k is :
     * 4
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        System.out.println("Enter the charecter k :");
        char k = scan.next().charAt(0);
        int res = findKIndex(s, k);
        if (res > 0) {
            System.out.println("The index of k is :");
            System.out.println(res);
        } else {
            System.out.println("The charecter not in string :");
        }
        scan.close();
    }
}
