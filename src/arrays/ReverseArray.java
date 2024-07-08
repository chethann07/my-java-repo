package arrays;

// Write a program a reverse an array
import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
     * Input:
     * Enter the size of array :
     * 5
     * Enter the elements of the array :
     * 1 2 3 4 5
     * Output:
     * The reversed array is :
     * 5 4 3 2 1
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("The reversed array is :");
        reverse(arr);
        scan.close();
    }
}
