package arrays;

// Given an array of positive values and 0, write a program to put all the 0 at the end
import java.util.Scanner;

public class RearrangeZeros {

    public static void putZerosAtLast(int[] arr) {
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == 0) {
                j++;
            } else {
                arr[i] = arr[j];
                i++;
                j++;
            }
        }
        while (i < arr.length) {
            arr[i] = 0;
            i++;
        }
        System.out.println("The resultant array is :");
        for (int m = 0; m < arr.length; m++) {
            System.out.print(arr[m] + " ");
        }
    }

    /*
     * This program prints all the 0 at the end
     * Input:
     * Enter the number of elements in array :
     * 10
     * Enter the elements of array :
     * 3 7 0 4 0 6 0 8 0 3
     * Output:
     * The resultant array is :
     * 3 7 4 6 8 3 0 0 0 0
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        putZerosAtLast(arr);
        scan.close();
    }
}
