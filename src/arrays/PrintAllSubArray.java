package arrays;

import java.util.Scanner;

// Write a program to find all the subarrays of an array
public class PrintAllSubArray {

    public static void findAllSubArrays(int[] arr) {
        int size = 1;
        System.out.println("The subarrays are :");
        while (size <= arr.length) {
            for (int i = 0; i <= arr.length - size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            size++;
        }
    }

    // this program finds all the subarrays of an array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        findAllSubArrays(arr);
        scan.close();
    }
}
