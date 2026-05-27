/*
swap the elements of array with its adjacent elements. If the number of elements is odd then the last element will remain same. 
For example, if the array is [1, 2, 3, 4, 5] then the output should be [2, 1, 4, 3, 5].
*/

import java.util.Scanner;
class arradjswap {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1 ; i+=2){// i<n-1 because we are swapping with adjacent element, so we need to stop at second last element; i+=2 because we are swapping with adjacent element, so we need to skip the next element
            int temp=arr[i];//storing the value of current element in temp variable
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int i = 0; i <n; i++){
        System.out.println(arr[i]);
        }
        sc.close();
    }
}