/*
1. Fencing the Ground
In Westeros, the fighting ground is rectangular in shape. The King of Westeros, Bran Stark decides to build a fence around the ground. In order to help the construction workers to build a straight fence, he planned to place a thick rope around the ground. He decided to buy a rope of length that exactly fits the boundary. He also wanted to cover the entire ground with a thick carpet during the rainy season. The carpet should also be bought in such a way that it exactly covers the entire ground. Being the three-eyed Raven, he was lost in his thoughts and requested your help. Can you please help King Bran by writing a program to find the exact length of the rope and the exact area of the carpet that is required?
Hint: Area of rectangle = length breadth perimeter of a rectangle = 2* (length + breadth)
*/
import java.util.Scanner;
public class fencingground {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        System.out.println("The required Length is: " + perimeter);
        System.out.println("The required area of carpet is: " + area);
        sc.close();
    }
}
