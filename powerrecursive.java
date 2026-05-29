import java.util.Scanner;
public class powerrecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        powerrecursive ob = new powerrecursive();
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter a Power: ");
        int n = sc.nextInt();
        System.out.println("ans: "+ob.square(a,n));
        sc.close();
    }
    int square(int a, int n){
        if(n==1){
            return a;
        }
        return a*square(a,n-1);
    }
}