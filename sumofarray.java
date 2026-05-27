import java.util.Scanner;
class sumofarray {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        System.out.print("Enter the Elements: ");
        for(int i = 0; i <n ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("You entered: ");
        for(int k : arr){//for each loop
            System.out.print(k + " ");
        }
        System.out.println("");
        System.out.println("The sum of array elements: "+ sum);
        
        sc.close();
    }
}