package arrays;

// Given an array print all the subarrays of the given size
import java.util.Scanner;

public class SubArray {

    public static void printSubArray(int[] arr, int size) {
        System.out.println("The subarrays are :");
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    // this program prints all the subarray of the given size
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
        printSubArray(arr, size);
        scan.close();
    }
}
