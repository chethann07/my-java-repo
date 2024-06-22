package arrays;

// Write a program to merge three arrays such that first number of each array are consecutive to each other
import java.util.Scanner;

// This program merges the three given arrays
public class MergeThreeArrays {
    public static void mergingThreeArrays(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, k = 0;
        int[] res = new int[arr1.length + arr2.length + arr3.length];
        while (k < res.length) {
            if (i < arr1.length) {
                res[k] = arr1[i];
                k++;
            }
            if (i < arr2.length) {
                res[k] = arr2[i];
                k++;
            }
            if (i < arr3.length) {
                res[k] = arr3[i];
                k++;
            }
            i++;
        }
        System.out.println("The resultant array is :");
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
        System.out.println("Enter the number of elements in array 2 :");
        int o = scan.nextInt();
        System.out.println("Enter the elements of array 2 :");
        int arr3[] = new int[o];
        for (int i = 0; i < o; i++) {
            arr3[i] = scan.nextInt();
        }
        mergingThreeArrays(arr1, arr2, arr3);
        scan.close();
    }

}
