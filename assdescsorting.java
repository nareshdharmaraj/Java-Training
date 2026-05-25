//Day 1 test question 2: Given an array of integers, sort the first half of the array in ascending order and the second half in descending order. For example, if the input is [5, 2, 9, 1, 5, 6] the output should be [1, 2, 5, 9, 6, 5].
import java.util.Scanner;

public class assdescsorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort complete array in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int mid = n / 2;

        // Print first half in ascending
        for (int i = 0; i < mid; i++) {
            System.out.print(arr[i] + " ");
        }

        // Print second half in descending
        for (int i = n - 1; i >= mid; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}