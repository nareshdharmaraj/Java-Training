import java.util.Scanner;
public class gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int g= 0;
        if (a>b){
            g=a;
        }
        else{
            g=b;
        }
        for(int i=g; i>0; i--){
            if(a%i == 0 && b%i == 0){
                System.out.println("GCD of "+ a + " and " +b+ " is "+ i);
                break;
            }
        }
        sc.close();
    }
}