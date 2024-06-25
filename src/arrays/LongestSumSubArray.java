package arrays;

import java.util.Scanner;

public class LongestSumSubArray {
    public static void findAllSubArrays(int[] arr) {
        System.out.println("The subarrays are :");
        for (int size = arr.length; size >= 1; size--) {
            for (int i = 0; i <= arr.length - size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }

    // this program finds all the subarrays of an array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        findAllSubArrays(arr);
        scan.close();
    }
}
