/*
Inthis program we are going to learn about jagged array in java. 
A jagged array is an array of arrays where the inner arrays can have different lengths. It is also known as an "array of arrays" or "ragged array".
*/
import java.util.*;
public class jaggedarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();//we are getting the number of rows for the jagged array
        int ar[][]=new int[r][];//we are declaring a 2D array with r rows and variable number of columns
        for(int i=0;i<r;i++){
            ar[i]=new int[sc.nextInt()];//we are getting the number of columns for each row of the jagged array
        }
        for(int i = 0; i<ar.length;i++){//ar.length gives the number of rows in the jagged array
            for(int j=0;j<ar[i].length; j++){//ar[i].length gives the number of columns in the current row of the jagged array
                ar[i][j]=sc.nextInt();//we get the elements of the jagged array from the user and store them in the respective positions of the array
            }
        }
        for(int i = 0; i<ar.length; i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}