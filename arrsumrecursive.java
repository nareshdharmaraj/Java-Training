
import java.util.Scanner;
public class arrsumrecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        arrsumrecursive ob = new arrsumrecursive();
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ans: "+ ob.sum(arr, n-1));
        sc.close();
    }
    int sum(int arr[], int n){
        if(n == 0){
            return arr[0];
        }
        return arr[n]+sum(arr,n-1);
    }
}