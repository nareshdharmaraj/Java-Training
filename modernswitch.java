import java.util.*;
public class modernswitch{
    public static void main(String args[]) {
        Scanner sk=new Scanner(System.in);
        int a = 202 ;
        String name=switch(a){
            case 101->"Harish";
            case 202->"sabari";
            case 303->"sujith";
            default ->"Invalid name";
        };
    System.out.println(name);
    sk.close();
    }
}