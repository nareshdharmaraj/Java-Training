import java.util.Scanner;
public class voteage {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("Voting age eligibility checker");
        System.out.print("Enter the voter's age: ");
        int age = scanner.nextInt();

        if(age <=18 ){
            throw new ArithmeticException("Not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
        scanner.close();
    }
}
//}
