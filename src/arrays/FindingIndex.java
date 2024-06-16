package arrays;

import java.util.Scanner;

public class FindingIndex {

    public static void findMaxIndex(int[] arr) {
        int index = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The maximum element in the array is : " + max);
        System.out.println("The index of maximum element in the array is : " + index);
    }

    // This program finds the index of the maximum number in the array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("The elements of the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        findMaxIndex(arr);
        scan.close();
    }
}
