//import java.util.*;
class awheel{//normal
    void rotate(){
        System.out.println("Wheel rotating");
    }
}
class bcar extends awheel{//single inheritance
    void sedan(){
        System.out.println("Sedan is luxury car");
    }
}
class croad extends bcar{//multilevel
    void road(){
        System.out.println("runs on road");
    }
}
class transport extends bcar{//hierarchial
    void type(){
        System.out.println("Car is a type of transport");
    }
}

public class inheritance{
    public static void main(String[] args){
        System.out.println("Normal");
        awheel a = new awheel();
        a.rotate();
        
        System.out.println("single");
        bcar b = new bcar();
        b.rotate();
        b.sedan();
        
        System.out.println("multilevel");
        croad c = new croad();
        c.rotate();
        c.sedan();
        c.road();
        
        System.out.println("hierarchial");
        transport d = new transport();
        d.rotate();
        d.sedan();
        d.type();
        //sc.close();
    }
}