import java.util.Scanner;
class arrayreverse {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for(int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered: ");
        for(int k : arr){//for each loop
            System.out.print(k + " ");
        }
        System.out.println("");
        System.out.println("Reversing the elements: ");
        for(int i = n-1; i>0;i--){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}