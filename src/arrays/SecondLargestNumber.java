package arrays;

import java.util.Scanner;

public class SecondLargestNumber {

    public static int secondLargestNum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = max;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    // This program prints the second largest number inside the array
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
        int secondMaxNum = secondLargestNum(arr);
        System.out.println("The second maximum number of array is :" + secondMaxNum);
        scan.close();
    }
}
