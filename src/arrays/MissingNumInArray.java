package arrays;

// Write a program to find the missing number in an array of size n
import java.util.Scanner;

public class MissingNumInArray {
    public static void findMissingNum(int[] arr) {
        // We take find the sum of first n+1 integer and subtract it from the sum of the
        // array to find the missing number
        int sum = 0;
        int n = arr.length + 1;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int sumOfN = n * (n + 1) / 2;

        int res = sumOfN - sum;
        System.out.println("The missing element in the array is :");
        System.out.println(res);

    }
    // This program finds the missing number in an array :
    /*
     * Input : 10
     * 1 2 3 4 5 7 8 9 10 11
     * Output : 6
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
        findMissingNum(arr);
        scan.close();

    }
}
