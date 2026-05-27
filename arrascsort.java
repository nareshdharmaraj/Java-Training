/*
Kailash and his daughter Keerthana were arguing about who is the smartest person in the family. Kailash who is a world-known Computer Engineer asked Keerthana who has not yet completed college to write a program to sort the given array in ascending order. Can you help Keerthana?
Array sorting is a common task in programming and there are many algorithms to sort an array. One of the simplest algorithms is the bubble sort algorithm, which repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. The process is repeated until the list is sorted.
*/
import java.util.Scanner;
public class arrascsort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n;i++){//0
            for(int j = 0; j<n;j++){//
                if(arr[i]<arr[j]){//
                    int temp = arr[i];//
                    arr[i] = arr[j];//
                    arr[j]=temp;//
                }
            }
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
