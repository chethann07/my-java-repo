package arrays;

// Given a sorted array of integer values, print the largest unique element inside the array
import java.util.Scanner;

public class LargestUniqueNum {
    public static void largestNum(int[] arr) {
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.println("The largest number among the unique elements in array is " + arr[i + 1]);
                    break;
                }
                count = 1;
            }
        }
    }

    // This program finds the maximum number among the unique elements inside the
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
