class Shape{
    void area(){
        System.out.println("area 1");
    }
    void area(int r){
        System.out.println("area of circle: "+ 3.14*r*r);
    }
    void area(int l, int b){
        System.out.println(l*b);
    }
}
public class circlearea {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(2);
    }
}
