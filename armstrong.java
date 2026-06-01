import java.util.Scanner;
//import java.util.*;
class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int ori =n;
        int input = n;
        int count = 0;
        while (n!=0){
            count++;
            n=n/10;
        }
        System.out.println(count);
        int sum=0;
        while (ori!=0){
            int k = ori%10;
            sum = sum + (int)(Math.pow(k,count)); // we are using "(int)" because while using math.pow()it will return value as double, so to convert it into integer we are using (int) before math.pow()
            ori = ori/10;
        }
        System.out.println(sum);
        if(sum==input){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
        sc.close();
    }
}