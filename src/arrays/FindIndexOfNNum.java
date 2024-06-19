package arrays;

import java.util.Scanner;

// 

public class FindIndexOfNNum {

    public static int findNum(int[] arr, int k) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                index = i;
            }
        }
        return index;
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
        System.out.println("Enter the element that you need to search for : ");
        int k = scan.nextInt();
        int res = findNum(arr, k);
        System.out.println("The index of the element k is : " + res);
        scan.close();
    }
}
