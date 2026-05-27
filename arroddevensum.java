/*
Get the input from user and store it in an array and find the sum of odd and even numbers present in the array separately and print the result.
*/

import java.util.Scanner;
public class arroddevensum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements ");
        int oddsum =0;
        int evensum = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                evensum = evensum + arr[i];
            }
            else{
                oddsum = oddsum+arr[i];
            }
        }
        System.out.println("Sum of even: "+evensum);
        System.out.println("Sum of odd: "+oddsum);
        sc.close();
    }
}