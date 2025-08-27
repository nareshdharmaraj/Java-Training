class Grandpa{
    void land(){
        System.out.println("grandp");
    }
}
class Parent extends Grandpa{
    void car(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    void toy(){
        System.out.println("Child");
    }
}


public class inheritance {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        c.toy();
        c.car();
        c.land();
        p.land();
    }
}
