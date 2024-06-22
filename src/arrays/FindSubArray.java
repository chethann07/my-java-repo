package arrays;

import java.util.Scanner;

// Write a program to find the subarrays whose sum is equal to k 
public class FindSubArray {
    public static void findSubArrays(int[] arr, int size, int k) {
        System.out.println("The subarrays whose sum is equal to k are : ");
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            if (sum == k) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }

    // this program finds the subarrays whose sum is equal to k
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the size of subarray :");
        int size = scan.nextInt();
        System.out.println("Enter the value of k :");
        int k = scan.nextInt();
        findSubArrays(arr, size, k);
        scan.close();
    }
}
