package arrays;

// in a given sorted array , print all the elements without repeating
import java.util.Scanner;

public class PrintNonRepeatingValue {

    public static void dispNonRepeatingValues(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.print(arr[arr.length - 1] + " ");
    }

    // this program prints all the non repeating elements in an array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        dispNonRepeatingValues(arr);
        scan.close();
    }
}
