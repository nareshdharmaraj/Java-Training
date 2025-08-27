import java.util.Scanner;
public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int repeating = -1;
        outer: 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeating = arr[i];
                    break outer;
                }
            }
        }
        if (repeating != -1) {
            System.out.println("First repeating number: " + repeating);
        } else {
            System.out.println("No repeating number found");
        }

        sc.close();
    }
}
