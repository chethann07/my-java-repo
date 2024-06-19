package arrays;

// Given a sorted array of integer values, print the largest repeating element inside the array
import java.util.Scanner;

public class LargestRepeatingNum {
    public static void largestNum(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    // This program finds the maximum number among the repeating elements inside the
    // sorted array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        largestNum(arr);
        scan.close();
    }
}
