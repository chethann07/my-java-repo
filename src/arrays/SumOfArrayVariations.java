package arrays;

import java.util.Scanner;

public class SumOfArrayVariations {
    public static int largestElement(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int smallestElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    // this program prints the maximum and the minimum sum of the elements of array

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

        int largestNum = largestElement(arr);
        int smallestNum = smallestElement(arr);
        int res = sumOfArray(arr);

        System.out.println("The sum of all the elements of array is: " + res);
        System.out.println("The maximum sum of (n-1) element in an array is: " + (res - smallestNum));
        System.out.println("The minimum sum of (n-1) element in an array is: " + (res - largestNum));

        scan.close();
    }
}
