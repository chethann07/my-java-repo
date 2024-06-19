package arrays;

// Given a sorted interger array, write a program to find the occurances of each element inside the array
import java.util.Scanner;

public class FindOccurances {

    public static void findingOccurance(int[] arr) {
        int count = 1;
        // for (int i = 0; i < arr.length; i++) {
        // int count = 1;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // i++;
        // }
        // }
        // System.out.println(arr[i] + "-" + count);
        // }
        System.out.println("The occurances of the numbers are :");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                System.out.println(arr[i] + "-" + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + "-" + count);
    }

    // This program finds the occurances of each element in the array
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        findingOccurance(arr);
        scan.close();
    }
}
