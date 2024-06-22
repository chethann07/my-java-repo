package arrays;

import java.util.Scanner;

public class SumOfSubArrays {

    public static void printSumOfSubArray(int[] arr, int size) {
        System.out.println("The sum of subarrays are :");
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            System.out.println(sum);
        }
    }

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
        printSumOfSubArray(arr, size);
        scan.close();
    }
}
