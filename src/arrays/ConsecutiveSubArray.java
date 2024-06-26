package arrays;

// Given an array of integers, write a program to print all consecutive subarrays
import java.util.Scanner;

public class ConsecutiveSubArray {

    public static void findConsecutiveSubArray(int[] arr) {
        System.out.println("The consecutive subarray are :");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
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
     * 5 2 3 4 9 12 13 14 15 9
     * Output:
     * The consecutive subarray are :
     * 5
     * 2 3 4
     * 9
     * 12 13 14 15
     * 9
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
        findConsecutiveSubArray(arr);
        scan.close();
    }
}
