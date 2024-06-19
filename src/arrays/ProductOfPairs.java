package arrays;

// Write a program to find the maximum sum and product of array pairs

import java.util.Scanner;

public class ProductOfPairs {

    public static void maxProductOfPairs(int[] arr, int n) {
        int m = n * (n - 1) / 2;
        int[] prodArr = new int[m];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                prodArr[index] = arr[i] * arr[j];
                if (prodArr[index] > max) {
                    max = prodArr[index];
                }
                index++;
            }
        }

        System.out.println("The elements of the products of pairs array");
        for (int i = 0; i < prodArr.length; i++) {
            System.out.print(prodArr[i] + " ");
        }
        System.out.println();
        System.out.println("The maximum number in the product of pair array is :" + max);
    }

    public static void maxSumOfPairs(int[] arr, int n) {
        int m = n * (n - 1) / 2;
        int[] sumArr = new int[m];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sumArr[index] = arr[i] + arr[j];
                if (sumArr[index] > max) {
                    max = sumArr[index];
                }
                index++;
            }
        }

        System.out.println("The elements of the sum of pairs array");
        for (int i = 0; i < sumArr.length; i++) {
            System.out.print(sumArr[i] + " ");
        }
        System.out.println();
        System.out.println("The maximum number in the sum of pair array is :" + max);
    }

    public static void maxProductOfPairs2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = max;
        int min = Integer.MAX_VALUE;
        int secMin = min;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin) {
                secMin = arr[i];
            }
        }

        int res1 = max * secMax;
        int res2 = min * secMin;

        if (res1 > res2) {
            System.out.println("The maximum number in the product of pair array is :" + res1);
        } else {
            System.out.println("The maximum number in the product of pair array is :" + res2);
        }
    }

    public static void maxSumOfPairs2(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = max;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }

        int res1 = max + secMax;
        System.out.println("The maximum number in the sum of pair array is :" + res1);

    }
    /*
     * this program first finds the product of pairs inside the array and then gives
     * the maximum value in that array it also finds the sum of pairs and maximum
     * value in that array
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
        // maxProductOfPairs(arr, n);
        // maxSumOfPairs(arr, n);
        maxProductOfPairs2(arr);
        scan.close();
    }

}
