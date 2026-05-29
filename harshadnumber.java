import java.util.Scanner;
public class harshadnumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int ori = sc.nextInt();
        int n = ori;
        int sum = 0;
        while (n>0){
            int temp = n%10;
            sum = sum+temp;
            n=n/10;
        }
        if(ori%sum==0){
            System.out.println("Harsad number");
        }
        else{
            System.out.println("Not harsad number");
        }
        sc.close();
    }
}