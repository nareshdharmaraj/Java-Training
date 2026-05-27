/*
In this program, you will be given two arrays. You need to check whether the sum of the elements of both the arrays is the same or not. Also, you need to check whether the size of both the arrays is the same or not. Finally, you need to check whether both the arrays are exactly the same or not.
*/

import java.util.Scanner;
class arrsumsizeelementchk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size: ");
        int r = sc.nextInt();
        int sum1 = 0;
        int arr1[] = new int[r];
        System.out.print("Enter the Elements of first array: ");
        for(int i = 0; i < r ; i++){
            arr1[i] = sc.nextInt();
            sum1 = sum1+arr1[i];
        }
        System.out.println("Enter the second array size: ");
        int c = sc.nextInt();
        int sum2 =0;
        int arr2[] = new int[c];
        System.out.print("Enter the Elements of second array: ");
        for(int j = 0; j < c ; j++){
            arr2[j] = sc.nextInt();
            sum2 = sum2+arr2[j];
        }
        int tri =0;
        if(r==c){
            for (int i=0; i<r;i++){
                //for(int j =0; )
                if(arr1[i] != arr2[i]){
                    tri = 1;
                }
            }
        }
        if(tri == 0){
            System.out.println("Same exactly");
        }
        else{
            System.out.println("Not same exactly");
        }
        
        if(r==c && sum1 == sum2){
            System.out.println("Same sum and size");
        }
        else{
            System.out.println("Not same sum and size");
        }
        sc.close();
    }
}