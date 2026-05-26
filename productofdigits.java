import java.util.Scanner;
class productofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int n = sc.nextInt();
        int product = 1;
        while(n!=0){
            product *= n%10;
            n=n/10;
        }
        System.out.println(product);
        sc.close();
    }
}