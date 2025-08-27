
public class problem {
    public static void main(String[] args){
        int a = 5;
        int b = 4;
        System.out.println(a++ + --b - ++a+b);
        System.out.println(a);
        System.out.println(b);
        System.out.println("_____________________________________________________");
        int c = 5;
        if(c++==5 && ++c>=5){
            System.out.println("True");
        }
        System.out.println(c);
    }
}
