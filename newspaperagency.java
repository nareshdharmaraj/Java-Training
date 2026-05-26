/*
2. The Newspaper Agency
Each Saturday, The Herald sells a' copies of a special edition newspaper for Rs.b per copy. 
The cost to the Herald of each newspaper is Rs.c. 
The Herald pays a fixed cost for storage, delivery, and so on of Rs.100 per Saturday. 
The Herald wants to calculate the profit which it obtains only on Saturdays. 
Can you please help them out by writing a C++ program to compute the profit if a, b, and c are given?
*/
import java.util.Scanner;
public class newspaperagency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int profit = (a * b) - (a * c) - 100; // profit = (revenue) - (cost) - (fixed cost)
        System.out.println("The profit is: " + profit);
        sc.close();
    }
}
