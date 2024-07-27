package concepts;

import java.util.Scanner;

public class MinSumOfLast {

    public static void findAllSubArrays(int[] arr, int k) {
        int size = k;
        int index = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - size; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            // int[] arr2 = new int[size];
            // int l = 0;
            for (int j = i; j < i + size; j++) {
                // System.out.print(arr[j] + " ");
                // if (l <= size) {
                // arr2[l] = arr[j];
                // l++;
                // }

                if (arr[j] < min) {
                    min = arr[j];
                }

                if (arr[j] > max) {
                    max = arr[j];
                }

            }

            int diff = max - min;

            if (diff < minSum) {
                minSum = diff;
                index = i;
            }
            // int max = Integer.MIN_VALUE;
            // int min = Integer.MAX_VALUE;
            // int sum = 0;
            // for (int j = 0; j < arr2.length; j++) {
            // // System.out.print(arr2[j] + " ");
            // // if (arr2[j] > max) {
            // // max = arr2[j];
            // // }

            // // if (arr2[j] < min) {
            // // min = arr2[j];
            // // }
            // }
            // sum = max - min;
            // minSum = max - min;
            // // System.out.println(sum);
            // if (sum < minSum) {
            // minSum = sum;
            // }
            // System.out.println(minSum);
            // System.out.println();
        }

        for (int j = index; j < index + k; j++) {
            System.out.println(arr[j] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        findAllSubArrays(arr, k);
        scan.close();
    }
}
