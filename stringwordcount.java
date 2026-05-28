/*
Get the input from the user and count the number of words in the string. Use built-in methods.
*/

import java.util.*;
public class stringwordcount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("\\s+");
        int count = 0;
        for(int i  = 0; i <arr.length; i++){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}