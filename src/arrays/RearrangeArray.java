package arrays;

// Given an array of positive values and -1, write a program to put all the -1 at the starting
import java.util.Scanner;

public class RearrangeArray {

    public static void putNegativeAtFirst(int[] arr) {
        int i = arr.length - 1, j = arr.length - 1;
        while (i >= 0) {
            if (arr[i] == -1) {
                i--;
            } else {
                arr[j] = arr[i];
                j--;
                i--;
            }
        }
        while (j >= 0) {
            arr[j] = -1;
            j--;
        }
        System.out.println("The resultant array is :");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
    }

    /*
     * This program prints all the -1 at the start
     * Input:
     * Enter the number of elements in array :
     * 10
     * Enter the elements of array :
     * 1 2 3 -1 4 5 6 -1 8 10
     * Output:
     * The resultant array is :
     * -1 -1 1 2 3 4 5 6 8 10
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        putNegativeAtFirst(arr);
        scan.close();
    }
}
