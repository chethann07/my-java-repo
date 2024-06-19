package arrays;

// Given an array of integer and K, print all the pairs whose sum is equal to K
import java.util.Scanner;

public class FindKInArrayPair {

    public static void findK(int[] arr, int k) {
        System.out.println("The pairs whose sum is equal to K are :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    // This program finds all the pairs whose sum is equal K
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
        System.out.println("Enter the value of K : ");
        int k = scan.nextInt();
        findK(arr, k);
        scan.close();
    }
}
