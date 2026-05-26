import java.util.Scanner;
class estar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid;
        if(n%2 == 0){
            mid = (n+1)/2;
        }
        else{
            mid = n/2;
        }
        for (int i = 0; i <n; i++){
            for(int j = 0; j<n;j++){
                if(i==0 ||j==0 || i==n-1 || i == mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}