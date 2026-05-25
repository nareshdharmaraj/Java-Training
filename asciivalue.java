//import java.util.*;
import java.util.Scanner;
public class asciivalue{
    public static void main(String[] args){
        System.out.println("Hello world \tfrom Java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().charAt(1);
        System.out.println("Ascii value of " + a + " is " + (int)a);
        sc.close();
    }
}

/*
Here the value is got as input then using the type chasting techniques we have got the ascii value of it

Type chasting:
Type casting is the process of converting a variable from one data type to another. In Java, there are two types of type casting:
1. widening type casting:
    - This is the process of converting a smaller data type to a larger data type. 
    - For example, converting an int to a long or a float to a double. 
    - This is done automatically by the Java compiler and is also known as implicit type casting.
    - bytes -> shorts -> ints -> longs -> floats -> doubles
    byte a = 20;
    int b = a; // widening type casting


2. Narrowing type casting:
    - This is the process of converting a larger data type to a smaller data type. 
    - For example, converting a long to an int or a double to a float.
    - This is done manually by the programmer and is also known as explicit type casting.
    - doubles -> floats -> longs -> ints -> shorts -> bytes
    int a = 100;
    byte b = (byte) a; // narrowing type casting)
*/