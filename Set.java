import java.util.HashSet;

public class Set {
    /*
     * it does not allow the duplicates
     * it does not maintain the insertion order
     * it allows the null values
     * it stores in hashing form
     * it stores in the ascending order
     */
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(72);
        s.add(00);
        s.add(75);
        s.add(45);
        s.add(66);
        s.add(72); // duplicate
        System.out.println(s);

        for(int i: s){
            System.out.println(i + " ");
        }
    }
}
