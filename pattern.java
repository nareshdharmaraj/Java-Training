import java.util.Scanner; public class pattern {
    public static void main(String[] args){ 
        System.out.println("Pattern program________________________________________");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Pattern 1: FILLED BOX");
        for (int i = 1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("Pattern 2: STEPS TOWARDS LEFT");
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("Pattern 3: STEPS TOWARDS RIGHT");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Pattern 4: PYRAMID");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("Pattern 5: PYRAMID");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("Pattern 6: DIAMOND");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("Pattern 7: UDUKAI");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }



        System.out.println("Pattern 8: SQUARE");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("Pattern 9: CROSS ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i+j==n+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Pattern 9: CROSS AND BOX");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==j || i+j==n+1 || i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

