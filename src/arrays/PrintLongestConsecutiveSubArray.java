package arrays;

// Given an array of integers, write a program to print the longest consecutive subarrays
import java.util.Scanner;

public class PrintLongestConsecutiveSubArray {
    public static void findLargestConsecutiveSubArray(int[] arr) {
        System.out.println("The longest consecutive subarray is :");
        int count = 1, max = 0, ei = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                if (count >= max) {
                    max = count;
                    ei = i;
                }
                count = 1;
            }
        }
        if (count >= max) {
            max = count;
            ei = arr.length - 1;
        }

        int si = ei - max + 1;
        for (int i = si; i <= ei; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * This program prints all the longest consecutive subarray
     * Input:
     * Enter the number of elements in array :
     * 15
     * Enter the elements of array :
     * 1 2 3 4 5 7 8 9 11 12 13 14 15 1 2
     * Output:
     * The longest consecutive subarray is :
     * 1 2 3 4 5
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
        findLargestConsecutiveSubArray(arr);
        scan.close();
    }
}