package arrays;

import java.util.Scanner;

public class ArrayOperations {

    // Finds the sum of the array
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Finds the product of the array
    public static int productOfArray(int[] arr) {
        int prod = 1;
        for (int i = 0; i < arr.length; i++) {
            prod = prod * arr[i];
        }
        return prod;
    }

    public static void arrayUtility(int[] arr) {
        // Printing even numbers in array
        System.out.println("The even elements in array :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Printing odd numbers in array
        System.out.println("The even elements in array :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Printing even elements in the first half of the array
        System.out.println("The even elements in the first half of the array :");
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // Printing the array in reverse order
        System.out.println("The array in reverse order :");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("The elements of the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arrayUtility(arr);
        int resSum = sumOfArray(arr);
        System.out.println("The sum of the array is : " + resSum);
        int resProduct = productOfArray(arr);
        System.out.println("The sum of the array is : " + resProduct);
        scan.close();
    }

}
