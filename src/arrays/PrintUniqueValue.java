package arrays;
// In a given sorted array , print all the unique elements in the array

import java.util.Scanner;

public class PrintUniqueValue {

    public static void dispUniqueElements(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.print(arr[i] + " ");
                }
                count = 1;
            }
        }
        if (count == 1) {
            System.out.print(arr[arr.length - 1]);
        }
    }

    // This program prints all the unique elements inside the array
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
        dispUniqueElements(arr);
        scan.close();
    }
}
