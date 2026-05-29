import java.util.Scanner;
public class fibnociirecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        fibnociirecursive ob = new fibnociirecursive();
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        for(int i =0; i <n; i++){
            System.out.print(ob.fibnocii(i) + " ");
        }
        sc.close();
    }
    int fibnocii(int n){
        if(n==0||n==1){
            return n;
        }
        return fibnocii(n-1)+fibnocii(n-2);
    }
}