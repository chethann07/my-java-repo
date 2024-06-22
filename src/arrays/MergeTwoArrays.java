package arrays;

// Given two sorted arrays, write a program to merge these two arrays such that the resultant array is sorted
import java.util.Scanner;

public class MergeTwoArrays {
    // this program merges two sorted arrays such that the resultant array is sorted
    public static void mergingTwoArrays(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr2[j] <= arr1[i]) {
                res[k++] = arr2[j++];
            } else {
                res[k++] = arr1[i++];
            }
        }
        while (i < arr1.length) {
            res[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            res[k++] = arr2[j++];
        }

        for (int n = 0; n < res.length; n++) {
            System.out.print(res[n] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array 1 :");
        int m = scan.nextInt();
        System.out.println("Enter the elements of array 1 :");
        int arr1[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the number of elements in array 2 :");
        int n = scan.nextInt();
        System.out.println("Enter the elements of array 2 :");
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }
        mergingTwoArrays(arr1, arr2);
        scan.close();
    }
}
