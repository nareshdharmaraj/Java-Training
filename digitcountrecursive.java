import java.util.Scanner;
public class digitcountrecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        digitcountrecursive ob = new digitcountrecursive();
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        System.out.println("ans: "+ ob.count(n));
        sc.close();
    }
    int c = 0;
    int count(int n){
        if(n==0){
            return 0;
        }
        return 1+count(n/10);
    }
}