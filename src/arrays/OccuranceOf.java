package arrays;

import java.util.Scanner;

public class OccuranceOf {

    public static int findingOccurance(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the element that you need to search the occurance of : ");
        int k = scan.nextInt();
        int res = findingOccurance(arr, k);
        System.out
                .println(
                        "The number of times that the given number " + k + " has appeared inside the array is :" + res);
        scan.close();
    }
}
