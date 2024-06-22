package arrays;

import java.util.Scanner;

public class RepeatingInTwoArrays {

    public static void findRepeatingNum(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
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
        findRepeatingNum(arr1, arr2);
        scan.close();
    }
}
