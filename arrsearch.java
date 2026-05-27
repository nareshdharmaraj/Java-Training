/*
To get the input of 2D array and search for an element in it and print the position of that element. If the element is not found then print "Element not found".
*/

import java.util.Scanner;
class arrsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < r ; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        int trigger = 0;
        for(int i = 0; i < r ; i++){
            for(int j = 0; j<c; j++){
                if(arr[i][j] == search){
                    System.out.println("The element "+ search+" is at the position of "+i + " " + j);
                    trigger = 1;
                }
            }
        }
        if(trigger == 0){
            System.out.println("Element not found");
        }
        sc.close();
    }
}