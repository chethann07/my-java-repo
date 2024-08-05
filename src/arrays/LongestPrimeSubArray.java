package arrays;

import java.util.Scanner;

public class LongestPrimeSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        printLongestSubArray(arr);
        scan.close();
    }

    private static void printLongestSubArray(int[] arr) {
        int maxSize = 0;
        int start = 0;
        for (int size = arr.length; size >= 1; size--) {
            for (int i = 0; i <= arr.length - size; i++) {
                int count = 0;
                for (int j = i; j < i + size; j++) {
                    if (isPrime(arr[j])) {
                        count++;
                    }
                }
                if (count == size) {
                    maxSize = size;
                    start = i;
                    break;
                }
            }
            if (maxSize > 0)
                break;
        }
        for (int i = start; i < start + maxSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
