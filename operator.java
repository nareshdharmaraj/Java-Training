import java.util.Scanner;
public class operator {
    public static void main (String[] args){
        System.out.println("Hey welcome to the game! You enter a number, i will display the last digit of the number of it.");
        System.out.print("First enter the number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        
        int lastdigit = number % 10;
        int remaining = number / 10;
        
        System.out.println("The last digit is: "+ lastdigit + " The remaining digits are : " + remaining);
        scanner.close();
    }
}
