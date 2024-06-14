package arrays;

import java.util.Scanner;

public class ProductOfArrayVariation {

    public static int productOfArray(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product = product * array[i];
        }
        return product;
    }

    public static void productOfArrays(int[] array, int n, int product) {
        int[] result = new int[n];
        for (int i = 0; i < array.length; i++) {
            result[i] = product / array[i];
        }
        System.out.println("The elements of the new array");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    /*
     * this program prints resultant array with the product of (n-1)elements present
     * in the array
     */
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

        int product = productOfArray(arr);
        System.out.println("The product of the array is :" + product);
        productOfArrays(arr, n, product);

        scan.close();
    }
}
