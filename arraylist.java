import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        ArrayList<Object> l = new ArrayList<>();
        l.add("Naresh");
        l.add("Learns");
        l.add("Java");
        l.add(1);
        l.add(1.5);
        l.remove(1);
        l.add(null);
        System.out.println(l);
        l.clear();
        System.out.println(l);

    }
}
    

