import java.util.Scanner;
public class integertobinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = sc.nextInt();
        String b = Integer.toBinaryString(a);
        System.out.println("Bit count of " + a + " is " + Integer.bitCount(a));
        System.out.println("Binary value of " + a + " is " + b);
        System.out.println("signed rightshift of " + a + " is " + (a >> 1));
        System.out.println("signed leftshift of " + a + " is " + (a << 1));
        System.out.println("unsigned rightshift of " + a + " is " + (a >>> 1));
        System.out.println("unsigned leftshift of " + a + " is " + (a << 1));
        String c = Integer.toBinaryString(-a);
        System.out.println("Bit count of " + (-a) + " is " + Integer.bitCount(-a));
        System.out.println("Binary value of " + (-a) + " is " + c);
        System.out.println("signed rightshift of " + (-a) + " is " + (-a >> 1));
        System.out.println("signed leftshift of " + (-a) + " is " + (-a << 1));
        System.out.println("unsigned rightshift of " + (-a) + " is " + (-a >>> 1));
        System.out.println("unsigned leftshift of " + (-a) + " is " + (-a << 1));
        sc.close();
    }
}
/*
while converting the number to binary we have used the inbuilt function of java which is Integer.toBinaryString() which takes an integer as input and returns a string representation of the binary value of the integer.
if we enter any negative number then it will return the binary value of the negative number in 2's complement form. for example if we enter -5 then it will return 11111111111111111111111111111011 which is the 2's complement form of -5.
it prints upto 32 digits because the maximum value of an integer in java is 2^31 - 1 which is 2147483647 and the minimum value of an integer in java is -2^31 which is -2147483648. so the binary representation of any integer will be at most 32 bits long.

we use Integer.bitCount() to count the number of 1's in the binary representation of the integer. for example if we enter 5 then it will return 2 because the binary representation of 5 is 101 which has 2 1's in it.
*/