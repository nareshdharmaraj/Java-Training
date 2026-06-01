// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
//import java.util.*;
class disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int ori =n;
        int input = n;
        int count = 0;
        while (n!=0){//1
            count++;//3
            n=n/10;//0
        }
        System.out.println(count);
        int sum=0;
        while (ori!=0 && count != 0){//1, 1
            int k = ori%10;//1
            sum = sum + (int)(Math.pow(k,count));//5^3 + 7^2 + 1^1
            ori = ori/10;//0
            count--;//0
        }
        System.out.println(sum);
        if(sum==input){
            System.out.println("Disarium number");
        }
        else{
            System.out.println("Not Disarium number");
        }
        sc.close();
    }
}