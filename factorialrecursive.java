import java.util.Scanner;
public class factorialrecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        factorialrecursive ob = new factorialrecursive();
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        System.out.println(n + " factorial is: " + ob.factorial(n));
        sc.close();
    }
    int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
