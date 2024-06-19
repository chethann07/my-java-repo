package arrays;
// In a given sorted array , count  the no of unique elements in the array

import java.util.Scanner;

public class CountUniqueElements {

    public static void countUniqueElement(int[] arr) {
        System.out.println("The number of unique elements in array :");
        int count = 1;
        int unique = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    unique++;
                }
                count = 1;
            }
        }
        if (count == 1) {
            unique++;
        }
        System.out.println(unique);
    }

    // This program prints the number of unique elements inside an array
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
        countUniqueElement(arr);
        scan.close();
    }
}
