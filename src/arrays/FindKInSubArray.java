package arrays;

// Write a program to find number of subarrays whose sum is equal to a given value k 
import java.util.Scanner;

public class FindKInSubArray {

    public static void findK(int[] arr, int size, int k) {
        int count = 0;
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            if (sum == k) {
                count++;
            }
        }
        System.out.println("The number of subarrays whose sum is equal to k are : " + count);
    }

    // this program finds the number of subarrays whose sum is equal to a given
    // value k
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
        findK(arr, size, k);
        scan.close();
    }
}
