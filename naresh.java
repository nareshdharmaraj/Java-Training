import java.util.Scanner;

class naresh{
    public static void main(String[] args){
        
        System.out.println("Please enter the details: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an Integer value: ");
        int num = s.nextInt();
        System.out.println("Enter a Float value: ");
        float f = s.nextFloat();
        System.out.println("Enter a character: ");
        char c = s.next().charAt(0);
        System.out.println("Enter a String: ");
        String str = s.next();
        System.out.println("Enter a boolean value: ");
        boolean b = s.nextBoolean();
        
        
        System.out.println("Integer: " +num + " float: " +f + " Char: "+c+ "String: "+ str+ " Boolean: " +b);
        s.close();
    }
}  