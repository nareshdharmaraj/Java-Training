public class swapping {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("New value of A: "+a+ " New value of b: "+b);
    }
}
