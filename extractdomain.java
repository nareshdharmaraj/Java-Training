//Day 1 test question 1: Extract the domain name from the given email ID and print it. For example, if the input is "naresh@gmail.com" the output is "gmail.com".
import java.util.Scanner;

public class extractdomain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        int atIndex = email.indexOf('@');

        if (atIndex != -1) {
            String domain = email.substring(atIndex + 1);
            System.out.println("Domain Name: " + domain);
        } else {
            System.out.println("Invalid Email ID");
        }

        sc.close();
    }
}