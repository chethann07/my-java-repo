package arrays;

// Given an array of integers, write a program to print all consecutive subarrays
import java.util.Scanner;

public class ConsecutiveSubArrayVariation {

    public static void findSubArray(int[] arr) {
        System.out.println("The subarray are :");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] >= arr[i]) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
                System.out.println();
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    /*
     * This program prints all the 0 at the end
     * Input:
     * Enter the number of elements in array :
     * 10
     * Enter the elements of array :
     * 5 12 13 14 9 13 3 7 8 12
     * Output:
     * The subarray are :
     * 5 12 13 14
     * 9 13
     * 3 7 8 12
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
        findSubArray(arr);
        scan.close();
    }
}
