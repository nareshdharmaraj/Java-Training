import java.util.Scanner;
public class twistedprime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        int product = 1;
        int ans1 =0;
        for(int i =2; i<input; i++){
            for(int j =i; j<input; j++){
                product = i*j;
                if(product == input){
                    ans1 = 1;
                    break;
                }
            }
        }
        if(ans1==1){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime, checking for twisted prime...");
            String temp = Integer.toString(input);
            StringBuffer rev = new StringBuffer(temp);
            rev.reverse();
            System.out.println(rev);
            String b = rev.toString();
            int reve = Integer.parseInt(b);
            int input2 = reve;
            int product1 = 1;
            int ans2 =0;
            for(int i =2; i<input2; i++){
                for(int j =i; j<input2; j++){
                    product1 = i*j;
                    if(product1 == input2){
                        ans2 = 1;
                        break;
                    }
                }
            }
            if(ans2==1){
                System.out.println("Not Twisted prime");
            }
            else{
                System.out.println("Twisted prime");
            }
        }
        sc.close();
    }
}