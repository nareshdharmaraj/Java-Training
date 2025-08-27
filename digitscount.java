import java.util.Scanner;
public class digitscount {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a integer value to check its digit count: ");
        int value = scanner.nextInt();

        int number = Math.abs(value);
        
        int count= 0;
        if (number == 0){
            count = 1;
        }
        else{
            while (number > 0){
                number = number/10;
                count ++;
            }
        }
        System.out.println(value + " has " +count+ " digits.");
        scanner.close();
    }
}