import java.util.Scanner;
class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age != 0 && age < 100){
            if (age >= 18){
                System.out.println("You are elligible to vote");
            }
            else{
                System.out.println("You are not elligible to vote");
            }
        }
        else{
            System.out.println("Enter a valid age");
        }
        sc.close();
    }
}